package codility.lessons.lesson91_tasks_from_indeed_prime_2016_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class HilbertMazeTest {
    @Test
    fun sample1Test() {
        val N = 2
        val A = 2
        val B = 5
        val C = 6
        val D = 6
        val actual = hilbertMaze(N, A, B, C, D)
        val expected = 7
        Assertions.assertEquals(expected, actual)
    }

    @Test
    @Disabled
    fun sample2Test() {
        val N = 3
        val A = 6
        val B = 6
        val C = 10
        val D = 13
        val actual = hilbertMaze(N, A, B, C, D)
        val expected = 39
        Assertions.assertEquals(expected, actual)
    }
}