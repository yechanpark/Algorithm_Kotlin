package codility.lessons.lesson11_sieve_of_eratosthenes

import kotlin.math.sqrt

/**
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 *
 *
 * A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.
 *
 *
 * You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.
 *
 *
 * Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.
 *
 *
 * For example, consider an integer N = 26 and arrays P, Q such that:
 *
 *
 * P[0] = 1    Q[0] = 26
 * P[1] = 4    Q[1] = 10
 * P[2] = 16   Q[2] = 20
 * The number of semiprimes within each of these ranges is as follows:
 *
 *
 * (1, 26) is 10,
 * (4, 10) is 4,
 * (16, 20) is 0.
 * Write a function:
 *
 *
 * class Solution { public int[] solution(int N, int[] P, int[] Q); }
 *
 *
 * that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.
 *
 *
 * For example, given an integer N = 26 and arrays P, Q such that:
 *
 *
 * P[0] = 1    Q[0] = 26
 * P[1] = 4    Q[1] = 10
 * P[2] = 16   Q[2] = 20
 * the function should return the values [10, 4, 0], as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [1..50,000];
 * M is an integer within the range [1..30,000];
 * each element of arrays P, Q is an integer within the range [1..N];
 * P[i] ≤ Q[i].
 */

// 1 <= P/Q.length <= 30000
// 1 <= P요소 <= Q요소 <= N
// 반소수는 1번만 구해서 P, Q쪽에 비교하는 방식이 빠를 것.
fun countSemiprimes(N: Int, P: IntArray, Q: IntArray): IntArray {

    // 소수를 저장해놓는 캐시
    val primeCache = mutableMapOf<Int, Int>()

    // 소수가 아닌 수를 저장해놓는 캐시
    val nonPrimeCache = mutableMapOf<Int, Int>()

    // 세미 프라임을 저장해놓는 캐시
    val semiPrimeCache = mutableMapOf<Int, Int>()

    // 세미프라임이 아닌걸 저장해놓는 캐시
    val noneSemiPrimeCache = mutableMapOf<Int, Int>()
    val result = IntArray(P.size)
    for (i in P.indices) {

        // P[0] ~ Q[0] 까지 순회
        var p = P[i]
        while (p <= Q[i]) {


            // 소수 캐싱
            checkPrime(p, primeCache, nonPrimeCache)

            // 2 * 2 = 4이므로 4 미만은 해당하지 않음
            // 따라서 바로 다음 for에서는 4가 되도록 3을 세팅
            if (p < 4) {
                p = 3
                p++
                continue
            }

            // 논 세미 프라임 캐시에 있다면 다음꺼 바로 감
            if (noneSemiPrimeCache.containsKey(p)) {
                p++
                continue
            }

            // 세미 프라임 캐시에 있다면 결과에 더함
            if (semiPrimeCache.containsKey(p)) {
                result[i]++
            } else {
                var semiPrimeCount = 0
                var j = 2
                while (j <= sqrt(p.toDouble())) {
                    if (j * j == p) {
                        // j가 소수면 증가
                        // p가 16일 때, 1 2 4 8 16 이 약수인데 4는 소수가 아니므로 해당되지 않음
                        if (checkPrime(j, primeCache, nonPrimeCache)) {
                            semiPrimeCount++
                        }
                    } else if (p % j == 0) {
                        // j와 p/j가 동시에 소수면 증가
                        if (
                            checkPrime(j, primeCache, nonPrimeCache)
                            && checkPrime(p / j, primeCache, nonPrimeCache)
                        ) {
                            semiPrimeCount += 2
                        }
                    }


                    // 3개가 넘어가는 경우 semi-prime이 아니므로 탈출
                    if (semiPrimeCount >= 3) {
                        break
                    }
                    j++
                }

                // 약수의 갯수가 1 또는 2라면 semi-prime이므로 해당 숫자를 캐싱, 결과에 더함
                if (semiPrimeCount in 1..2) {
                    result[i]++
                    semiPrimeCache[p] = 1
                } else {
                    noneSemiPrimeCache[p] = 1
                }
            }
            p++
        }
    }
    return result
}

// 소수인지 아닌지 검사
internal fun checkPrime(N: Int, primeCache: MutableMap<Int, Int>, nonPrimeCache: MutableMap<Int, Int>): Boolean {
    if (N <= 1) return false

    // 논 프라임 캐시에 있으면 패스
    if (nonPrimeCache.containsKey(N)) {
        return false
    }

    // 프라임 캐시에 있으면 true
    if (primeCache.containsKey(N)) {
        return true
    }

    // 소수는 1과 자기 자신으로만 나뉘어져야 한다.
    // 따라서 2~ sqrt(N) 까지 약수가 1개라도 있다면 소수가 아님
    var i = 2
    while (i <= sqrt(N.toDouble())) {
        if ((i * i == N) || (N % i == 0)) {
            nonPrimeCache[N] = 1
            return false
        }
        i++
    }
    primeCache[N] = 1
    return true
}