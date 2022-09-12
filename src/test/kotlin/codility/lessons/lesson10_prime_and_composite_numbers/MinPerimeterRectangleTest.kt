package codility.lessons.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinPerimeterRectangleTest {
    @Test
    fun sample1Test() {
        val N = 30
        val actual = minPerimeterRectangle(N)
        val expected = 22
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val N = 36
        val actual = minPerimeterRectangle(N)
        val expected = 24
        Assertions.assertEquals(expected, actual)
    }
}