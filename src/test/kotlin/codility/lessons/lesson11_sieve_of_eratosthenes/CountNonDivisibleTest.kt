package codility.lessons.lesson11_sieve_of_eratosthenes

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountNonDivisibleTest {
    @Test
    fun sample1Test() {
        val N = 26
        val P = intArrayOf(1, 4, 16)
        val Q = intArrayOf(26, 10, 20)
        val actual = countNonDivisible(N, P, Q)
        val expected = intArrayOf(10, 4, 0)
        Assertions.assertArrayEquals(expected, actual)
    }
}