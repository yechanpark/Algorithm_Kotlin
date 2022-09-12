package codility.lessons.lesson6_sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberOfDiscIntersectionsImageTest {
    @Test
    fun sample1Test() {
        val arr = intArrayOf(1, 5, 2, 1, 4, 0)
        val actual = numberOfDiscIntersections(arr)
        val expected = 11
        Assertions.assertEquals(expected, actual)
    }
}