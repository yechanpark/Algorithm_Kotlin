package codility.lessons.lesson6_sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DistinctTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(2, 1, 1, 2, 3, 1)
        val actual = distinct(arr)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(0)
        val actual = distinct(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf()
        val actual = distinct(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}