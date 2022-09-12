package codility.lessons.lesson4_counting_elements

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PermCheckTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(4, 1, 3, 2)
        val actual = permCheck(arr)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(4, 1, 3)
        val actual = permCheck(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}