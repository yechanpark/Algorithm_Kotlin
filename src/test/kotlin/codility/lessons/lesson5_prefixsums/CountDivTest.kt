package codility.lessons.lesson5_prefixsums

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountDivTest {
    @Test
    fun sample1Test() {
        val A = 6
        val B = 11
        val K = 2
        val actual = countDiv(A, B, K)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}