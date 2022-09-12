package codility.lessons.lesson5_prefixsums

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinAvgTwoSliceTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(4, 2, 2, 5, 1, 5, 8)
        val actual = minAvgTwoSlice(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}