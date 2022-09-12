package codility.lessons.lesson90_tasks_from_indeed_prime_2015_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class FloodDepthTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 3, 2, 1, 2, 1, 5, 3, 3, 5, 2)
        val actual = floodDepth(A)
        val expected = 2
        Assertions.assertEquals(expected, actual)
    }

    @Test
    @Disabled
    fun sample2Test() {
        val A = intArrayOf(5, 8)
        val actual = floodDepth(A)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}