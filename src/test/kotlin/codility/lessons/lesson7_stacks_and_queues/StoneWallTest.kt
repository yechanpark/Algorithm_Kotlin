package codility.lessons.lesson7_stacks_and_queues

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StoneWallTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)
        val actual = stoneWall(arr)
        val expected = 7
        Assertions.assertEquals(expected, actual)
    }
}