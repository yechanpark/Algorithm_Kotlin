package codility.lessons.lesson7_stacks_and_queues

import java.util.*

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 *
 *
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(String S); }
 *
 *
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 *
 *
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
// 괄호 포맷이 맞으면 1, 아니면 -1 리턴하기
// 괄호는 () {} [] 3가지 종류
fun brackets(S: String): Int {
    val characterArr = S.toCharArray()
    val popStack = Stack<Char>()
    for (i in characterArr.indices.reversed()) {

        // 비어있으면 계속함
        if (popStack.empty()) {
            popStack.push(characterArr[i])
            continue
        }
        when (characterArr[i]) {
            // 왼쪽 괄호가 나왔는데 팝된게 매치가 안되면 안됨.
            '{' -> if (popStack.pop() != '}') return 0
            '[' -> if (popStack.pop() != ']') return 0
            '(' -> if (popStack.pop() != ')') return 0

            // 위 3개가 아니면 스택에 저장
            else -> popStack.push(characterArr[i])
        }
    }
    return if (popStack.empty()) 1 else 0
}