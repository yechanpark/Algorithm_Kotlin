package codility.lessons.lesson7_stacks_and_queues

import java.util.*

/**
 * You are given two non-empty arrays A and B consisting of N integers. Arrays A and B represent N voracious fish in a river, ordered downstream along the flow of the river.
 *
 *
 * The fish are numbered from 0 to N − 1. If P and Q are two fish and P < Q, then fish P is initially upstream of fish Q. Initially, each fish has a unique position.
 *
 *
 * Fish number P is represented by A[P] and B[P]. Array A contains the sizes of the fish. All its elements are unique. Array B contains the directions of the fish. It contains only 0s and/or 1s, where:
 *
 *
 * 0 represents a fish flowing upstream,
 * 1 represents a fish flowing downstream.
 * If two fish move in opposite directions and there are no other (living) fish between them, they will eventually meet each other. Then only one fish can stay alive − the larger fish eats the smaller one. More precisely, we say that two fish P and Q meet each other when P < Q, B[P] = 1 and B[Q] = 0, and there are no living fish between them. After they meet:
 *
 *
 * If A[P] > A[Q] then P eats Q, and P will still be flowing downstream,
 * If A[Q] > A[P] then Q eats P, and Q will still be flowing upstream.
 * We assume that all the fish are flowing at the same speed. That is, fish moving in the same direction never meet. The goal is to calculate the number of fish that will stay alive.
 *
 *
 * For example, consider arrays A and B such that:
 *
 *
 * A[0] = 4    B[0] = 0
 * A[1] = 3    B[1] = 1
 * A[2] = 2    B[2] = 0
 * A[3] = 1    B[3] = 0
 * A[4] = 5    B[4] = 0
 * Initially all the fish are alive and all except fish number 1 are moving upstream. Fish number 1 meets fish number 2 and eats it, then it meets fish number 3 and eats it too. Finally, it meets fish number 4 and is eaten by it. The remaining two fish, number 0 and 4, never meet and therefore stay alive.
 *
 *
 * Write a function:
 *
 *
 * class Solution { public int solution(int[] A, int[] B); }
 *
 *
 * that, given two non-empty arrays A and B consisting of N integers, returns the number of fish that will stay alive.
 *
 *
 * For example, given the arrays shown above, the function should return 2, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [0..1,000,000,000];
 * each element of array B is an integer that can have one of the following values: 0, 1;
 * the elements of A are all distinct.
 */
// N(1) <= A.length, B.length <= N(100000)
// 0 <= A 요소 <= 1000000000
// B 요소 : 0 or 1 (방향, 0 => 상류로 흐르는 물고기, 1 => 하류로 흐르는 물고기)
// A 각 요소는 물고기, 0~ N-1까지 존재
// P < N 일 때 P인덱스 물고기가 상류임
// 각 물고기의 위치가 시작점 -> 0은 오른쪽에서 왼쪽으로, 1은 왼쪽에서 오른쪽으로 이동
//   -> A[0] 물고기가 B[i] = 0 인 경우 맨 왼쪽에서 왼쪽으로 가므로, 절대 죽지 않음.
//   -> A[A.length-1] 물고기가 B[i] = 1인 경우, 맨 오른쪽에서 오른쪽으로 가므로, 절대 죽지 않음.
// A[P], A[N] 등은 물고기의 크기를 말함
fun fish(A: IntArray, B: IntArray): Int {

    // 상류로 가는 물고기가 있으면 스택에 저장, 하나씩 빼면서 하류로 가는 물고기를 만나면 빼서 싸움
    val goingUpFighter = Stack<Int>()
    var count = 0

    // 하류로 가는 물고기 위주로 시작
    for (i in A.indices) {
        // 현재 물고기가 하류로 가는 경우
        if (B[i] == 0) {
            // 상류로 가는 물고기가 앞에 없으면 무조건 생존
            if (goingUpFighter.empty()) {
                count++
            }

            // 상류로 가는 물고기가 앞에 있으면 덩치싸움
            else {
                while (!goingUpFighter.empty()) {
                    val fighterFish = goingUpFighter.pop()

                    // 상류로 가는 물고기가 더 쎄면 A[i]는 죽음, 다음 인덱스 물고기를 봄
                    if (fighterFish > A[i]) {
                        goingUpFighter.push(fighterFish)
                        break
                    }

                    // 하류로 가는 물고기가 더 쎄면 자동으로 다음 상류로 가는 물고기랑 싸움, 만약 더 싸울 물고기가 없다면 얘가 제일 쎈애임
                    if (goingUpFighter.empty()) {
                        count++
                        break
                    }
                }
            }
        }

        // 상류로 가는 물고기는 싸움 목록에 저장
        else {
            goingUpFighter.push(A[i])
        }
    }

    // 하류에 끝까지 갈 수 있는 물고기 수(count) + 상류에 끝까지 갈 수 있는 물고기 수 (goingUpFighter.size())
    return count + goingUpFighter.size
}