package codility.lessons.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FlagsTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
        val actual = flags(A)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}