package codility.lessons.lesson16_greedy_algorithms

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TieRopesTest {
    @Test
    fun sample1Test() {
        val K = 4
        val A = intArrayOf(1, 2, 3, 4, 1, 1, 3)
        val actual = tieRopes(K, A)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}