package codility.lessons.lesson6_sorting

import java.util.*

/**
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 *
 *
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 * For example, consider array A such that:
 *
 *
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * Triplet (0, 2, 4) is triangular.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int[] A); }
 *
 *
 * that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 *
 *
 * For example, given array A such that:
 *
 *
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * the function should return 1, as explained above. Given array A such that:
 *
 *
 * A[0] = 10    A[1] = 50    A[2] = 5
 * A[3] = 1
 * the function should return 0.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 *
 * @see [참고](https://reddeco.tistory.com/entry/Triangle)
 */
// 0 <= A.length(N) <= 100000
// −2147483648 <= A요소 <= 2147483647
// 삼각형 조건
// 1. (P, Q, R)일 때 0 <= P < Q < R < N 을 만족 (값이 아닌 인덱스)
// 2. A [P] + A [Q]> A [R],
//    A [Q] + A [R]> A [P],
//    A [R] + A [P]> A [Q]
fun triangle(A: IntArray): Int {

    // 배열이 정렬된 상태라면(P < Q < R) 3가지 조건 중 다음 2가지는 항상 만족
    // Q + R > P
    // P + R > Q
    // 따라서 P + Q > R 인지만 확인하면 된다.
    A.sort()

    for (i in 2 until A.size) {
        if (A[i - 2].toDouble() + A[i - 1].toDouble() > A[i]) {
            return 1
        }
    }
    return 0
}