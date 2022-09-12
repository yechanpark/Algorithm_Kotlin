package codility.lessons.lesson4_countingelements

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 *
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 *
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 *
 *
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the values of the counters after each consecutive operation will be:
 *
 *
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 * The goal is to calculate the value of every counter after all operations.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int[] solution(int N, int[] A); }
 *
 *
 * that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
 *
 *
 * Result array should be returned as an array of integers.
 *
 *
 * For example, given:
 *
 *
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the function should return [3, 2, 2, 4, 2], as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N and M are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..N + 1].
 */
// 1 <= X <= N 이 되는 A[K] = X이면, 연산 K는 증가(x)
// A[K] = N + 1이면 연산 K는 최대 카운터
// A[0]=3 => K=0, X=3 => 1<=X(3)<=N(5) 이므로 연산 0은 증가(3) => 0,0,1,0,0
// A[1]=4 => K=1, X=4 => 1<=X(4)<=N(5) 이므로 연산 1은 증가(4) => 0,0,1,1,0
// A[2]=4 => K=2, X=4 => 1<=X(4)<=N(5) 이므로 연산 2는 증가(4) => 0,0,1,2,0
// A[3]=6 => K=3, X=6 => A[3]=6=N(5)+1 이므로 연산 3은 맥스 카운터 => 2,2,2,2,2
// A[4]=1 => K=4, X=1 => 1<=X(1)<=N(5) 이므로 연산 4는 증가(1) => 3,2,2,2,2
// A[5]=4 => K=5, X=4 => 1<=X(4)<=N(5) 이므로 연산 5는 증가(4) => 3,2,2,3,2
// A[6]=4 => K=6, X=4 => 1<=X(4)<=N(5) 이므로 연산 6은 증가(4) => 3,2,2,4,2
fun maxCounters(N: Int, A: IntArray): IntArray {
    var result = intArrayOf(N)
    var totalMax = 0
    var phaseMax = 0

    A.forEach { X ->
        if (X in 1..N) {
            if (++result[X - 1] > phaseMax) {
                phaseMax = result[X - 1]
            }
            return@forEach
        }

        if (X == N + 1) {
            if (phaseMax > 0) {
                totalMax += phaseMax
                phaseMax = 0
                result = intArrayOf(result.size)
            }
        }
    }

    if (totalMax > 0) {
        for (i in result.indices) {
            result[i] += totalMax
        }
    }

    return result
}