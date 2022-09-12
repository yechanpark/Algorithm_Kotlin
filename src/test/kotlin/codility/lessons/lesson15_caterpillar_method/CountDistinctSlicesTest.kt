package codility.lessons.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountDistinctSlicesTest {
    @Test
    fun sample1Test() {
        val M = 6
        val A = intArrayOf(3, 4, 5, 5, 2)
        val actual = countDistinctSlices(M, A)
        val expected = 9
        Assertions.assertEquals(expected, actual)
    }
}