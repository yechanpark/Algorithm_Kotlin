package codility.lessons.lesson14_binarysearch_algorithm

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinMaxDivisionTest {
    @Test
    fun sample1Test() {
        val K = 3
        val M = 5
        val A = intArrayOf(2, 1, 5, 1, 2, 2, 2)
        val actual = minMaxDivision(K, M, A)
        val expected = 6
        Assertions.assertEquals(expected, actual)
    }
}