package codility.lessons.lesson12_euclidean_algorithm

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ChocolatesByNumbersTest {
    @Test
    fun sample1Test() {
        val N = 10
        val M = 4
        val actual = chocolatesByNumbers(N, M)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val N = 1
        val M = 2
        val actual = chocolatesByNumbers(N, M)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}