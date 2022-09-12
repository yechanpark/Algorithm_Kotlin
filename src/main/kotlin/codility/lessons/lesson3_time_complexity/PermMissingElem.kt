package codility.lessons.lesson3_time_complexity

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 *
 * Your goal is to find that missing element.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int[] A); }
 *
 *
 * that, given an array A, returns the value of the missing element.
 *
 *
 * For example, given array A such that:
 *
 *
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */
fun permMissingElem(A: IntArray): Int {
    // 빈 배열인 경우 무조건 1 리턴
    if (A.isEmpty()) return 1

    A.sorted().forEachIndexed { index, i ->
        // A는 무조건 1부터 시작하므로, A[i]의 값은 i+1과 같아야 한다.
        if (index + 1 != i) return index + 1
    }

    // 만약 중간에 걸리지 않으면 맨 마지막 숫자가 비는 숫자
    return A.last() + 1
}