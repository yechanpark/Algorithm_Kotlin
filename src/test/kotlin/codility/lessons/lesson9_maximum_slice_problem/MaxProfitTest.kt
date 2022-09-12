package codility.lessons.lesson9_maximum_slice_problem

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxProfitTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(23171, 21011, 21123, 21366, 21013, 21367)
        val actual = maxProfit(arr)
        val expected = 356
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        val actual = maxProfit(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf(8, 9, 3, 6, 1, 2)
        val actual = maxProfit(arr)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}