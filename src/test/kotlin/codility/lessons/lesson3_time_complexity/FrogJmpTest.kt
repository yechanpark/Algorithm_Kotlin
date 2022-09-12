package codility.lessons.lesson3_time_complexity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FrogJmpTest {

    @Test
    fun sample1Test() {
        val actual = frogJmp(10, 85, 30)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }
}