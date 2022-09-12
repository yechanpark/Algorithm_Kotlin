package codility.lessons.lesson3_time_complexity

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 *
 *
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int X, int Y, int D); }
 *
 *
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 *
 *
 * For example, given:
 *
 *
 * X = 10
 * Y = 85
 * D = 30
 * the function should return 3, because the frog will be positioned as follows:
 *
 *
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 */

// X : 현재 위치 (1 이상)
// Y : 가고 싶은 위치 (X보다 같거나 큼, 1 이상)
// D : 고정된 이동거리 (1 이상)
// return : 가장 적은 이동 횟수

fun frogJmp(X: Int, Y: Int, D: Int): Int {
    // 가고싶은 위치 - 현재위치 = 이동해야 하는 거리
    val remainDistance = Y - X

    // 이미 제자리면 0번 이동
    if (remainDistance == 0) return 0

    var move = remainDistance / D
    if (remainDistance % D >= 1) move++
    return move
}