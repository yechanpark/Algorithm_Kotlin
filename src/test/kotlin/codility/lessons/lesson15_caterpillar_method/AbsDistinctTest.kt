package codility.lessons.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AbsDistinctTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(-5, -3, -1, 0, 3, 6)
        val actual = absDistinct(A)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val A = intArrayOf(-10, -10, -1, 0, 3, 6)
        val actual = absDistinct(A)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }
}