package codility.lessons.lesson8_leader

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EquiLeaderTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(4, 3, 4, 4, 4, 2)
        val actual = equiLeader(arr)
        val expected = 2
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val arr = intArrayOf(1, 2)
        val actual = equiLeader(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val actual = equiLeader(arr)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample4Test() {
        val arr = intArrayOf(4, 4, 2, 5, 3, 4, 4, 4)
        val actual = equiLeader(arr)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}