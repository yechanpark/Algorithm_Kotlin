package codility.lessons.lesson6_sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TriangleTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(10, 2, 5, 1, 8, 20)
        val actual = triangle(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(10, 50, 5, 1)
        val actual = triangle(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf()
        val actual = triangle(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample4Test() {
        val arr = intArrayOf(0)
        val actual = triangle(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample5Test() {
        val arr = intArrayOf(5, 3, 3)
        val actual = triangle(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}