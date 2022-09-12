package codility.lessons.lesson6_sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxProductOfThreeTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(-3, 1, 2, -2, 5, 6)
        val actual = maxProductOfThree(arr)
        val expected = 60
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(-5, -6, -4, -7, -10)
        val actual = maxProductOfThree(arr)
        val expected = -120
        Assertions.assertEquals(expected, actual)
    }
}