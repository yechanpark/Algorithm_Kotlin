package codility.lessons.lesson7_stacks_and_queues

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FishTest {
    @Test
    fun sample1Test() {
        val a = intArrayOf(4, 3, 2, 1, 5)
        val b = intArrayOf(0, 1, 0, 0, 0)
        val actual = fish(a, b)
        val expected = 2
        Assertions.assertEquals(expected, actual)
    }
}