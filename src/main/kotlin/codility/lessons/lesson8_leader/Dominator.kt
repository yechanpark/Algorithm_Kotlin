package codility.lessons.lesson8_leader

/**
 * An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 *
 *
 * For example, consider array A such that
 *
 *
 * A[0] = 3    A[1] = 4    A[2] =  3
 * A[3] = 2    A[4] = 3    A[5] = -1
 * A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 *
 *
 * Write a function
 *
 *
 * class Solution { public int solution(int[] A); }
 *
 *
 * that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 *
 *
 * For example, given array A such that
 *
 *
 * A[0] = 3    A[1] = 4    A[2] =  3
 * A[3] = 2    A[4] = 3    A[5] = -1
 * A[6] = 3    A[7] = 3
 * the function may return 0, 2, 4, 6 or 7, as explained above.
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */
// 배열 A에서 절반 이상을 차지하는 숫자에 대한 인덱스를 반환 (정답은 여러 개일 수 있음)
// 0 <= A.length <= 100000
// -2147483648 <= A요소 <= 2147483647
fun dominator(A: IntArray): Int {

    // A.length가 0이면 구할 수 없기때문에 Dominator가 없다.
    if (A.isEmpty()) return -1

    // A.length가 1이면 무조건 0번 인덱스가 Dominator
    if (A.size == 1) return 0

    val map = mutableMapOf<Int, Int>()

    // A배열의 요소가 음수든 짝수든, 과반수를 넘으려면 A.length/2 + 1을 해야함
    val dominatorCondition = A.size / 2 + 1

    A.forEachIndexed { index, i ->
        // map에 A[i]값을 키로 1씩 더함
        // 더한 후 리턴 값이 Dominator 조건에 부함되는 경우 (배열 A에서 과반수 이상 차지하는 경우) 해당 인덱스 리턴
        /**
         * Map.merge()를 쓰면 정확도는 100%가 나오지만, 내부적으로 추가적인 연산이 많아 속도가 느려 Performance 100%가 나오지 않음
         *
         * if (map.merge(A[i], 1, Integer::sum) >= dominatorCondition)
         * return i;
         */
        var number = map[i]

        // 숫자가 없으면 초기값을 넣음
        number ?: run {
            map[i] = 1
            return@forEachIndexed
        }

        if (++number >= dominatorCondition) return index
        map[i] = number
    }

    // 계산을 해도 Dominator가 없으면 -1 리턴
    return -1
}