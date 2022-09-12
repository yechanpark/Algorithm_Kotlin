package codility.lessons.lesson10_prime_and_composite_numbers

import kotlin.math.sqrt

/**
 * A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.
 *
 *
 * For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int N); }
 *
 *
 * that, given a positive integer N, returns the number of its factors.
 *
 *
 * For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [1..2,147,483,647].
 */
// 1 <= N <= 2147483647
// 약수의 갯수를 구하기
fun countFactors(N: Int): Int {
    // 1이라면 자기 자신만 해당하므로 1 리턴
    if (N == 1) {
        return 1
    }

    var count = 0

    // 1부터 N의 제곱근까지만 구한다.
    // 36의 경우 6까지만 계산해도 된다.
    // 24의 경우 4.xxxxx 에서 소수점을 내려서 4까지만 계산한다.
    var i = 1
    while (i <= sqrt(N.toDouble())) {

        // 제곱으로 나누어 어떨어지는 경우 (2 * 2 = 4), (7 * 7 = 49) +1만 한다.
        if (i * i == N) {
            count++
        } else if (N % i == 0) {
            count += 2
        }
        i++
    }
    return count
}