package codility.lessons.lesson17_dynamic_programming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberSolitaireTest {
    @Test
    fun sample1Test() {
        val A = intArrayOf(1, -2, 0, 9, -1, -2)
        val actual = numberSolitaire(A)
        val expected = 8
        Assertions.assertEquals(expected, actual)
    }
}