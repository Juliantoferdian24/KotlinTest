fun solution(A: IntArray, K: Int): IntArray? {
    if (A.isEmpty() || K < 0) {
        return A
    }
    var i = 0
    val j = A.size - 1
    for (a in 0 until K) {
        while (i != j) {
            val temp = A[i]
            A[i] = A[j]
            A[j] = temp
            i++
        }
        i = 0
    }
    return A
}