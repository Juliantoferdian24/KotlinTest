fun main() {
    var c = arrayOf(0, 0, 1, 0, 0, 1, 0)
    println(jumpingOnClouds(c))
}

fun jumpingOnClouds(c: Array<Int>): Int {
    var count = 0
    var i = 0
    while (i < c.size - 1) {
        if (c[i] == 0) i++
        count++
        i++
    }
    return count
}