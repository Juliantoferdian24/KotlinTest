fun main() {
    fibonacci(10)
}

fun fibonacci(n: Int) {
    var t1 = 0
    var t2 = 1
    var output = ""
    for (i in 1..n) {
        output += "$t1 "
        var sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    print(output)
}