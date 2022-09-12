package codility.lessons.lesson2_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OddOccurrencesInArrayTest {

    @Test
    fun sampleTest() {
        val arr = intArrayOf(9, 3, 9, 3, 9, 7, 9)
        val actual = oddOccurrencesInArray(arr)
        val expected = 7
        Assertions.assertEquals(expected, actual)
    }
}