package codility.lessons.lesson9_maximum_slice_problem

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxSliceSumTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(3, 2, -6, 4, 0)
        val actual = maxSliceSum(arr)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(1, 5, -1, 5, 1)
        val actual = maxSliceSum(arr)
        val expected = 11
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf(-2, -2)
        val actual = maxSliceSum(arr)
        val expected = -2
        Assertions.assertEquals(expected, actual)
    }
}