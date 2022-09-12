package codility.lessons.lesson9_maximum_slice_problem

/**
 * An array A consisting of N integers is given. It contains daily prices of a stock share for a period of N consecutive days. If a single share was bought on day P and sold on day Q, where 0 ≤ P ≤ Q < N, then the profit of such transaction is equal to A[Q] − A[P], provided that A[Q] ≥ A[P]. Otherwise, the transaction brings loss of A[P] − A[Q].
 *
 *
 * For example, consider the following array A consisting of six elements such that:
 *
 *
 * A[0] = 23171
 * A[1] = 21011
 * A[2] = 21123
 * A[3] = 21366
 * A[4] = 21013
 * A[5] = 21367
 * If a share was bought on day 0 and sold on day 2, a loss of 2048 would occur because A[2] − A[0] = 21123 − 23171 = −2048. If a share was bought on day 4 and sold on day 5, a profit of 354 would occur because A[5] − A[4] = 21367 − 21013 = 354. Maximum possible profit was 356. It would occur if a share was bought on day 1 and sold on day 5.
 *
 *
 * Write a function,
 *
 *
 * class Solution { public int solution(int[] A); }
 *
 *
 * that, given an array A consisting of N integers containing daily prices of a stock share for a period of N consecutive days, returns the maximum possible profit from one transaction during this period. The function should return 0 if it was impossible to gain any profit.
 *
 *
 * For example, given array A consisting of six elements such that:
 *
 *
 * A[0] = 23171
 * A[1] = 21011
 * A[2] = 21123
 * A[3] = 21366
 * A[4] = 21013
 * A[5] = 21367
 * the function should return 356, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [0..400,000];
 * each element of array A is an integer within the range [0..200,000].
 */
// 0 <= A.length <= 400000
// 0 <= A요소 <= 200000
fun maxProfit(A: IntArray): Int {
    // 배열 길이가 2 이하이면 구할 수 없음
    if (A.size < 2) return 0

    var result = 0

    // 배열에서 나온 숫자 중 최소값을 저장할 변수
    var min = Int.MAX_VALUE


    A.forEachIndexed { index, i ->
        // 처음엔 최소값을 넣음
        if (index == 0) {
            min = i
            return@forEachIndexed
        }

        // 현재 값이 직전 값보다 큰 경우
        if (A[index - 1] < i) {
            // (현재값 - min) 의 결과가 result보다 크면 result 갱신
            if (i - min > result) {
                result = i - min
            }
            return@forEachIndexed
        }

        if (A[index - 1] > i) {
            // (현재값 < min) 인 경우 min 갱신
            if (i < min) min = i
        }
    }

    return result
}