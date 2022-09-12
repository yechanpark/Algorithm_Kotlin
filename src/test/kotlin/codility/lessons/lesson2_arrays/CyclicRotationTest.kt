package codility.lessons.lesson2_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CyclicRotationTest {

    @Test
    fun sample1Test() {
        val arr = intArrayOf(3, 8, 9, 7, 6)
        val actual = cyclicRotation(arr, 3)
        val expected = intArrayOf(9, 7, 6, 3, 8)
        Assertions.assertArrayEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(0, 0, 0)
        val actual = cyclicRotation(arr, 1)
        val expected = intArrayOf(0, 0, 0)
        Assertions.assertArrayEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf(1, 2, 3, 4)
        val actual = cyclicRotation(arr, 4)
        val expected = intArrayOf(1, 2, 3, 4)
        Assertions.assertArrayEquals(expected, actual)
    }
}