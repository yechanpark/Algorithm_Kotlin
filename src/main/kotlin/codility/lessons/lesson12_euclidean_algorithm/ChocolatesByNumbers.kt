package codility.lessons.lesson12_euclidean_algorithm

import getGreatestCommonDivisor

/**
 * Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.
 *
 *
 * You start to eat the chocolates. After eating a chocolate you leave only a wrapper.
 *
 *
 * You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle, and eat the following one.
 *
 *
 * More precisely, if you ate chocolate number X, then you will next eat the chocolate with number (X + M) modulo N (remainder of division).
 *
 *
 * You stop eating when you encounter an empty wrapper.
 *
 *
 * For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.
 *
 *
 * The goal is to count the number of chocolates that you will eat, following the above rules.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int N, int M); }
 *
 *
 * that, given two positive integers N and M, returns the number of chocolates that you will eat.
 *
 *
 * For example, given integers N = 10 and M = 4. the function should return 5, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N and M are integers within the range [1..1,000,000,000].
 *
 * @see [참고](https://ergate.tistory.com/entry/Codility-ChocolatesByNumbers-1)
 */
fun chocolatesByNumbers(N: Int, M: Int): Int {
    if (N == 0) return 0
    if (N == 1) return 1

    // 최대공약수를 구하면 된다.
    val gcd = getGreatestCommonDivisor(N, M)

    // 최대공약수가 1이면 모든 초콜릿을 거치므로 초콜렛의 갯수(N) 리턴
    return if (gcd == 1) {
        N
    } else {
        N / gcd
    }
}
