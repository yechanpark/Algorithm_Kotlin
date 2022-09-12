package codility.lessons.lesson9_maximum_slice_problem

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxDoubleSliceSumTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)
        val actual = maxDoubleSliceSum(arr)
        val expected = 17
        Assertions.assertEquals(expected, actual)
    }
}