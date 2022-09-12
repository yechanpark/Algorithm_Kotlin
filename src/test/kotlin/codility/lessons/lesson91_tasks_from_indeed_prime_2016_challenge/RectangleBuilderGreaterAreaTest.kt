package codility.lessons.lesson91_tasks_from_indeed_prime_2016_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RectangleBuilderGreaterAreaTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 2, 5, 1, 1, 2, 3, 5, 1)
        val X = 5
        val actual = rectangleBuilderGreaterArea(A, X)
        val expected = 2
        Assertions.assertEquals(expected, actual)
    }
}