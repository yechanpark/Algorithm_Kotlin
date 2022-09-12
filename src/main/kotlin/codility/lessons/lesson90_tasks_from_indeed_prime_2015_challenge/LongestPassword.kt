package codility.lessons.lesson90_tasks_from_indeed_prime_2015_challenge

/**
 * You would like to set a password for a bank account. However, there are three restrictions on the format of the password:
 *
 *
 * it has to contain only alphanumerical characters (a−z, A−Z, 0−9);
 * there should be an even number of letters;
 * there should be an odd number of digits.
 * You are given a string S consisting of N characters. String S can be divided into words by splitting it at, and removing, the spaces. The goal is to choose the longest word that is a valid password. You can assume that if there are K spaces in string S then there are exactly K + 1 words.
 *
 *
 * For example, given "test 5 a0A pass007 ?xy1", there are five words and three of them are valid passwords: "5", "a0A" and "pass007". Thus the longest password is "pass007" and its length is 7. Note that neither "test" nor "?xy1" is a valid password, because "?" is not an alphanumerical character and "test" contains an even number of digits (zero).
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(String S); }
 *
 *
 * that, given a non-empty string S consisting of N characters, returns the length of the longest word from the string that is a valid password. If there is no such word, your function should return −1.
 *
 *
 * For example, given S = "test 5 a0A pass007 ?xy1", your function should return 7, as explained above.
 *
 *
 * Assume that:
 *
 *
 * N is an integer within the range [1..200];
 * string S consists only of printable ASCII characters and spaces.
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
fun longestPassword(S: String): Int {
    var result = -1
    var wordLength = 0
    var charCount = 0
    var numberCount = 0
    var valid = true

    S.forEachIndexed { index, c ->

        // 현재 단어가 유효하지 않은 경우
        if (!valid) {

            // 공백인 경우, 다음 인덱스의 문자가 새로운 단어가 시작됨을 의미하므로 valid값을 초기화
            if (c == ' ') valid = true

            // 다음 문자로 넘어감
            return@forEachIndexed
        }

        // a~z이거나 A~Z이면
        if ((c in 'a'..'z') || (c in 'A'..'Z')) {
            charCount++
            wordLength++
        } else if (c in '1'..'9' || c == '0') {
            numberCount++
            wordLength++
        } else {

            // 공백인 경우
            if (c == ' ') {
                // 영단어는 짝수갯수여야 하며, 숫자는 홀수 갯수여야 함
                if (charCount % 2 != 0 || numberCount % 2 != 1) {
                    wordLength = 0
                    charCount = 0
                    numberCount = 0
                    return@forEachIndexed
                } else if (result < wordLength) {
                    result = wordLength
                }
            } else {
                valid = false
            }

            // 값 초기화
            wordLength = 0
            charCount = 0
            numberCount = 0
        }

        // 마지막인 경우 마지막 단어 체크, 영단어는 짝수갯수여야 하며, 숫자는 홀수 갯수여야 함
        if (
            (index == S.lastIndex)
            && (charCount % 2 == 0 && numberCount % 2 == 1)
            && (result < wordLength)
        ) {
            result = wordLength
        }
    }

    return result
}