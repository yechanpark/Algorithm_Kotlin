package codility.lessons.lesson4_counting_elements

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MissingIntegerTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(1, 3, 6, 4, 1, 2)
        val actual = missingInteger(arr)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(1, 2, 3)
        val actual = missingInteger(arr)
        val expected = 4
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf(-1, -3)
        val actual = missingInteger(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}