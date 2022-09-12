package codility.lessons.lesson91_tasks_from_indeed_prime_2016_challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class TreeProductTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(0, 1, 1, 3, 3, 6, 7)
        val B = intArrayOf(1, 2, 3, 4, 5, 3, 5)
        val actual = treeProduct(A, B)
        val expected = "18"
        Assertions.assertEquals(expected, actual)
    }

    @Test
    @Disabled
    fun sample2Test() {
        val A = intArrayOf(0, 1)
        val B = intArrayOf(1, 2)
        val actual = treeProduct(A, B)
        val expected = "3"
        Assertions.assertEquals(expected, actual)
    }
}