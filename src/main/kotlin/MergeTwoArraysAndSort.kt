fun concatenate(a: IntArray, b: IntArray): IntArray {
    val output = a + b
    output.sort()
    return output
}

fun main() {
    val A = intArrayOf(1, 3, 5)
    val B = intArrayOf(2, 3)

    val concat = concatenate(A, B)

    println(concat.contentToString())        // [1, 2, 3, 4, 5]
}