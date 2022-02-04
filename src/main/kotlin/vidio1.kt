fun main() {
    solution(2)
}

fun solution(input: Int) {
    for (i in 1..input) {
        print("*".repeat(input) + "\n" + " ".repeat(i))
    }
}