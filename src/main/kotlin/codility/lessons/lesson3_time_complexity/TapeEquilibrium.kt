package codility.lessons.lesson3_time_complexity

import kotlin.math.abs

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 *
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 *
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 *
 *
 * For example, consider array A such that:
 *
 *
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * We can split this tape in four places:
 *
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 *
 *
 * class Solution { public int solution(int[] A); }
 *
 *
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 *
 * For example, given:
 *
 *
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * the function should return 1, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */

// 2 <= A.length
// -1000 <= A요소 <= 1000
fun tapeEquilibrium(A: IntArray): Int {
    var rightSum = A.sum()
    var leftSum = 0

    var result = Int.MAX_VALUE

    A.forEach {
        leftSum += it // 왼쪽에 A[i]를 더함
        rightSum -= it // 오른쪽에서 A[i]만큼 뺌

        // 둘다 음수거나 둘다 양수면 그냥 빼면 된다.
        val tempResult = if (leftSum < 0 && rightSum < 0 || leftSum > 0 && rightSum > 0)
            abs(rightSum - leftSum)
        // 하나는 음수고 하나는 양수면 절대값으로 더한다
        else
            abs(rightSum) + abs(leftSum)


        if (tempResult < result) result = tempResult
    }

    return result
}