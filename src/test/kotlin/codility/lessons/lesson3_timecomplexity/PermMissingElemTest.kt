package codility.lessons.lesson3_timecomplexity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PermMissingElemTest {

    @Test
    fun sample1Test() {
        val arr = intArrayOf(2, 3, 1, 5)
        val actual = permMissingElem(arr)
        val expected = 4
        Assertions.assertEquals(expected, actual)
    }
}