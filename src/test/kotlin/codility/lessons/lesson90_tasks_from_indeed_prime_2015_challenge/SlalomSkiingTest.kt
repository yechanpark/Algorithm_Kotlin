package codility.lessons.lesson90_tasks_from_indeed_prime_2015_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SlalomSkiingTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3)
        val actual = slalomSkiing(A)
        val expected = 8
        Assertions.assertEquals(expected, actual)
    }
}