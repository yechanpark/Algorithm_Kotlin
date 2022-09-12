package codility.lessons.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinAbsSumOfTwoTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, 4, -3)
        val actual = minAbsSumOfTwo(A)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val A = intArrayOf(-8, 4, 5, -10, 3)
        val actual = minAbsSumOfTwo(A)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val A = intArrayOf(1000000000)
        val actual = minAbsSumOfTwo(A)
        val expected = 2000000000
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample4Test() {
        val A = intArrayOf(0)
        val actual = minAbsSumOfTwo(A)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample5Test() {
        val A = intArrayOf(-1000000000)
        val actual = minAbsSumOfTwo(A)
        val expected = 2000000000
        Assertions.assertEquals(expected, actual)
    }
}