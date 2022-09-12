package codility.lessons.lesson91_tasks_from_indeed_prime_2016_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DwarfsRaftingTest {
    @Test
    fun sample1Test() {
        val N = 4
        val S = "1B 1C 4B 1D 2A"
        val T = "3B 2D"
        val actual = dwarfsRafting(N, S, T)
        val expected = 6
        Assertions.assertEquals(expected, actual)
    }
}