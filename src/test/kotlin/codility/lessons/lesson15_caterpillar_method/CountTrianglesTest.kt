package codility.lessons.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountTrianglesTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(10, 2, 5, 1, 8, 12)
        val actual = countTriangles(A)
        val expected = 4
        Assertions.assertEquals(expected, actual)
    }
}