package codility.lessons.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountFactorsTest {
    @Test
    fun sample1Test() {
        val input = 24
        val actual = countFactors(input)
        val expected = 8
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val input = 1
        val actual = countFactors(input)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}