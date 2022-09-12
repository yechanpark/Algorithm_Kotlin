package codility.lessons.lesson3_time_complexity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TapeEquilibriumTest {

    @Test
    fun sample1Test() {
        val arr = intArrayOf(3, 1, 2, 4, 3)
        val actual = tapeEquilibrium(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }
}