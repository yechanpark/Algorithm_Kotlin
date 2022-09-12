package codility.lessons.lesson4_counting_elements

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxCountersTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(3, 4, 4, 6, 1, 4, 4)
        val actual = maxCounters(5, arr)
        val expected = intArrayOf(3, 2, 2, 4, 2)
        Assertions.assertArrayEquals(expected, actual)
    }
}