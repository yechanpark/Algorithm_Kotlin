package codility.lessons.lesson1_iterations

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 */

fun binaryGap(n: Int): Int {
    // Data Validation. 5 미만의 경우 무조건 길이가 0임
    if (n < 5 || n > Int.MAX_VALUE - 1) return 0

    var biggestLength = 0 // 최대 길이
    var currentLength = 0 // 현재 길이

    /** Integer to Binary String **/
    val binaryString = Integer.toBinaryString(n)

    // 바이너리 길이만큼 돌면서
    for (element in binaryString) {

        // 1이 나오면 계산들어감
        if (element == '1') {

            // 현재 값이 최대값 보다 크거나 같으면 최대값 갱신
            if (currentLength >= biggestLength) {
                biggestLength = currentLength
            }

            // 현재 값 초기화
            currentLength = 0

            // 다음 순서로 넘어감
            continue
        }

        // 0이 나온 경우 현재값 + 1
        currentLength++
    }

    return biggestLength
}