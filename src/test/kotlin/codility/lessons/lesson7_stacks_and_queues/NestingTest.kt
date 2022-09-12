package codility.lessons.lesson7_stacks_and_queues

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NestingTest {
    @Test
    fun sample1Test() {
        val s = "(()(())())"
        val actual = nesting(s)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val s = "())"
        val actual = nesting(s)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}