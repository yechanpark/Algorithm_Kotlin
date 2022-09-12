package codility.lessons.lesson8_leader

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DominatorTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)
        val actual = dominator(arr)
        val expected = mutableListOf<Int>()
        expected.addAll(listOf(0, 2, 4, 6, 7))
        Assertions.assertTrue(expected.contains(actual))
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(2147483647)
        val actaul = dominator(arr)
        val expected = mutableListOf<Int>()
        expected.add(0)
        Assertions.assertTrue(expected.contains(actaul))
    }
}