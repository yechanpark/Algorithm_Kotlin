package codility.lessons.lesson4_countingelements

/**
 * A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.
 *
 *
 * You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
 *
 *
 * The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
 *
 *
 * For example, you are given integer X = 5 and array A such that:
 *
 *
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int X, int[] A); }
 *
 *
 * that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
 *
 *
 * If the frog is never able to jump to the other side of the river, the function should return −1.
 *
 *
 * For example, given X = 5 and array A such that:
 *
 *
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * the function should return 6, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N and X are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..X].
 */
// 개구리 처음 위치 : 0
// 목적지 : X + 1
// A : 떨어지는 나뭇잎을 나타내는 N개의 정수로 구성
// A[K] : 시간 K에서 한 잎이 떨어지는 위치 (초단위)
// A[0] : 처음 떨어진 잎의 위치
// A[1] : 1초 후 떨어진 잎 위치
// 1 <= N, X <= 100000
fun frogRiverOne(X: Int, A: IntArray): Int {
    val result = -1
    if (X > A.size) return result

    val checkMap = mutableMapOf<Int, Boolean>()

    for (i in 1..X) checkMap[i] = false

    A.forEachIndexed { index, i ->
        if (checkMap[i] != null) checkMap.remove(i)
        if (checkMap.isEmpty()) return index
    }

    return result
}