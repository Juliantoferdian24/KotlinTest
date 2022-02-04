class SalesByMatch {


}

fun main() {
    val n = 7
    val ar = arrayOf(1, 2, 1, 2, 1, 3, 2)
    println(sockMerchant(n, ar))
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    var pairs = 0
    val colors: HashSet<Int> = hashSetOf()

    colors.isEmpty()
    for (i in 0 until n) {
        if (!colors.contains(ar[i])) {
            colors.add(ar[i])
        } else {
            pairs++
            colors.remove(ar[i])
        }
    }
    return pairs
}