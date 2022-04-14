import kotlin.math.max

//Tokopedia
fun main() {
    print(binaryGap(35))
}

fun binaryGap(n: Int): Int {
    val biner = Integer.toBinaryString(n)
    var b = 0
    var maxB = 0
    for (i in biner) {
        if (i == '0') {
            b += 1
        } else {
            maxB = max(maxB, b)
            b = 0
        }
    }
    return maxB
}