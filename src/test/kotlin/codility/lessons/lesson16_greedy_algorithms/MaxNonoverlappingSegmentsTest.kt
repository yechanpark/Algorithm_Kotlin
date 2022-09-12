package codility.lessons.lesson16_greedy_algorithms

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxNonoverlappingSegmentsTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 3, 7, 9, 9)
        val B = intArrayOf(5, 6, 8, 9, 10)
        val actual = maxNonoverlappingSegments(A, B)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}