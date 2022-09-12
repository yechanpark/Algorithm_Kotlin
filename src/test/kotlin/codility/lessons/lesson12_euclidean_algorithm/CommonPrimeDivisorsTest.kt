package codility.lessons.lesson12_euclidean_algorithm

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CommonPrimeDivisorsTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(15, 10, 9)
        val B = intArrayOf(75, 30, 5)
        val actual = commonPrimeDivisors(A, B)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}