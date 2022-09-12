package codility.lessons.lesson17_dynamic_programming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinAbsSumTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 5, 2, -2)
        val actual = minAbsSum(A)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}