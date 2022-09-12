package codility.lessons.lesson13_fibonacci_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LadderTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(4, 4, 5, 5, 1)
        val B = intArrayOf(3, 2, 4, 3, 1)
        val actual = ladder(A, B)
        val expected = intArrayOf(5, 1, 8, 0, 1)
        Assertions.assertArrayEquals(expected, actual)
    }
}