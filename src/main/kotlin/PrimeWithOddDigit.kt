//fun main() {
//    println(primeWithOddDigit(20, 25))
//}
//
//fun primeWithOddDigit(startRange: Int, endRange: Int): Int {
//    var output = 0
//
//    for (i in startRange until endRange) {
//        if (isPrimeNumber(i) && Integer.toString(Math.abs(i)).trim().length) > 1 {
//            output += 1
//            println(i)
//        }
//    }
//    return output
//}
//
//fun isPrimeNumber(number: Int): Boolean {
//
//    for (i in 2..number / 2) {
//        if (number % i == 0) {
//            return false
//        }
//    }
//    return true
//}
