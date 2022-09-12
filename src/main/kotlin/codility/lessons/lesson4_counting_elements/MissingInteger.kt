package codility.lessons.lesson4_counting_elements

/**
 * This is a demo task.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int[] A); }
 *
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 *
 * Given A = [−1, −3], the function should return 1.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
// A에 존재하지 않는 양의 정수 중 가장 작은 것을 반환
// 1 < A.length == N <= 100000
// -1000000 < A요소 < 1000000
fun missingInteger(A: IntArray): Int {
    val integerMap = mutableMapOf<Int, Boolean>()

    A.sorted().forEach { i ->
        // 음수인 경우 스킵
        if (i <= 0) return@forEach
        integerMap[i] = true
    }

    // 1부터 순서대로 올라감
    for (i in 1 until Int.MAX_VALUE) {
        integerMap[i] ?: return i
    }

    // 여기까지 오지 않음
    return 1
}