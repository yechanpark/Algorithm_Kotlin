package codility.lessons.lesson5_prefix_sums

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GenomicRangeQueryTest {
    @Test
    fun sample1Test() {
        val P = intArrayOf(2, 5, 0)
        val Q = intArrayOf(4, 5, 6)
        val S = "CAGCCTA"
        val actual = genomicRangeQuery(S, P, Q)
        val expected = intArrayOf(2, 4, 1)
        Assertions.assertArrayEquals(expected, actual)
    }

    @Test
    fun sample2Test() {
        val P = intArrayOf(4, 4, 4)
        val Q = intArrayOf(4, 4, 4)
        val S = "CAGCCTA"
        val actual = genomicRangeQuery(S, P, Q)
        val expected = intArrayOf(2, 2, 2)
        Assertions.assertArrayEquals(expected, actual)
    }

    @Test
    fun sample3Test() {
        val P = intArrayOf(0, 0, 2)
        val Q = intArrayOf(3, 5, 5)
        val S = "TGCATGCA"
        val actual = genomicRangeQuery(S, P, Q)
        val expected = intArrayOf(1, 1, 1)
        Assertions.assertArrayEquals(expected, actual)
    }
}