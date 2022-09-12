package codility.lessons.lesson7_stacks_and_queues

import java.util.*

/**
 * A string S consisting of N characters is called properly nested if:
 *
 *
 * S is empty;
 * S has the form "(U)" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, string "(()(())())" is properly nested but string "())" isn't.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(String S); }
 *
 *
 * that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
 *
 *
 * For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [0..1,000,000];
 * string S consists only of the characters "(" and/or ")".
 */
fun nesting(S: String): Int {
    val characterStack = Stack<Char>()
    for (c in S.toCharArray()) {
        if (characterStack.empty()) {
            characterStack.push(c)
        }

        // 비어있지 않으면서 c값이 ')' 문자인 경우 스택에서 1개를 가져왔을 때 반드시 개행문자( '(' ) 여야 함
        // 개행문자가 아닌 경우 포맷에 맞지 않음
        else if (c == ')') {
            if (characterStack.pop() != '(') return 0
        }

        // 비어있지 않으면서 c값이 '('문자인 경우는 push
        else {
            characterStack.push(c)
        }
    }

    // 스택이 비어있어야 모든 짝이 맞음 (1), 스택이 남아있으면 짝이 맞지 않음 (0)
    return if (characterStack.empty()) 1 else 0
}