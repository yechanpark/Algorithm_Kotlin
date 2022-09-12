package codility.lessons.lesson4_countingelements

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FrogRiverOneTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)
        val actual = frogRiverOne(5, arr)
        val expected = 6
        Assertions.assertEquals(expected, actual)
    }
}