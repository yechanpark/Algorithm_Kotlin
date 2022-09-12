package codility.lessons.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PeaksTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
        val actual = peaks(A)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}