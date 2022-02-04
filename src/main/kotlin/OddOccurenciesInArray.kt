import java.util.*

fun solution(A: IntArray): Int {
    val arrSize = A.size
    if (arrSize == 1) {
        return A[0]
    }
    Arrays.sort(A)
    var i = 0
    while (i < arrSize) {
        if (i + 1 == arrSize) {
            return A[i]
        }
        if (A[i] != A[i + 1]) {
            return A[i]
        }
        i += 2
    }
    return 0
}

fun main() {
    val arr = intArrayOf(2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2)
    println(solution(arr))
}