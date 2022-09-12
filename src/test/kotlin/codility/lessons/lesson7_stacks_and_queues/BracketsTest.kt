package codility.lessons.lesson7_stacks_and_queues

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BracketsTest {
    @Test
    fun sample1Test() {
        val s = "{[()()]}"
        val actual = brackets(s)
        val expected = 1
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val s = "([)()]"
        val actual = brackets(s)
        val expected = 0
        Assertions.assertEquals(expected, actual)
    }
}