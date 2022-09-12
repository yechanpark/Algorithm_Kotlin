package codility.lessons.lesson13_fibonacci_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FibFrogTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)
        val actual = fibFrog(A)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}