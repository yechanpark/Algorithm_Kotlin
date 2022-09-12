package codility.lessons.lesson90_tasks_from_indeed_prime_2015_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestPasswordTest {
    @Test
    fun sample1Test() {
        val S = "test 5 a0A pass007 ?xy1"
        val actual = longestPassword(S)
        val expected = 7
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val S = "a"
        val actual = longestPassword(S)
        val expected = -1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val S = "0"
        val actual = longestPassword(S)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample4Test() {
        val S = "9999 999 00 0"
        val actual = longestPassword(S)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample5Test() {
        val S = "#"
        val actual = longestPassword(S)
        val expected = -1
        Assertions.assertEquals(expected, actual)
    }
}