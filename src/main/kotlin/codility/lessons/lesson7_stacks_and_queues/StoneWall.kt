package codility.lessons.lesson7_stacks_and_queues

import java.util.*

/**
 * You are going to build a stone wall. The wall should be straight and N meters long, and its thickness should be constant; however, it should have different heights in different places. The height of the wall is specified by an array H of N positive integers. H[I] is the height of the wall from I to I+1 meters to the right of its left end. In particular, H[0] is the height of the wall's left end and H[N−1] is the height of the wall's right end.
 *
 *
 * The wall should be built of cuboid stone blocks (that is, all sides of such blocks are rectangular). Your task is to compute the minimum number of blocks needed to build the wall.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int[] H); }
 *
 *
 * that, given an array H of N positive integers specifying the height of the wall, returns the minimum number of blocks needed to build it.
 *
 *
 * For example, given array H containing N = 9 integers:
 *
 *
 * H[0] = 8    H[1] = 8    H[2] = 5
 * H[3] = 7    H[4] = 9    H[5] = 8
 * H[6] = 7    H[7] = 4    H[8] = 8
 * the function should return 7. The figure shows one possible arrangement of seven blocks.
 *
 * <img src='StoneWallImage.png'></img>
 *
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [1..100,000];
 * each element of array H is an integer within the range [1..1,000,000,000].
 *
 * @see [참고](https://jobjava00.github.io/algorithm/codility/lesson7/StoneWall/)
 */
fun stoneWall(H: IntArray): Int {
    val stack = Stack<Int>()
    var count = 0
    for (i in H.indices) {
        while (!stack.isEmpty() && stack.peek() > H[i]) {
            stack.pop()
        }
        if (stack.isEmpty() || stack.peek() < H[i]) {
            stack.push(H[i])
            count++
        }
    }
    return count
}