package codility.lessons.lesson5_prefixsums

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PassingCarsTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(0, 1, 0, 1, 1)
        val actual = passingCars(arr)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }
}