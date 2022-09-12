package codility.lessons.lesson1_iterations

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryGapTest {

    @Test
    fun sample1Test() {
        val actual = binaryGap(1041)
        val expected = 5
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val actual = binaryGap(15)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val actual = binaryGap(32)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}