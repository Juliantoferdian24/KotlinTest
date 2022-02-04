fun main() {
    val ar = arrayOf(0, 1, 2, 3, 4, 5)
    print(factorOfSum(6, ar))
}

fun factorOfSum(n: Int, ar: Array<Int>) : MutableList<Int> {
    val output : MutableList<Int> = ArrayList()
    for (i in ar.indices) {
        for (j in i + 1 until ar.size) {
            if (ar[i] + ar[j] == n) {
                output.add(ar[i])
                output.add(ar[j])
            }
        }
    }
    return output
}