import kotlin.math.abs

class Tokopedia1 {

}
fun solution(input: String): Int {
    var x = 'A'
    var output = 0
    for (i in input.indices) {
        output += if(abs(x-input[i]) <13){
            abs(x - input[i])
        } else {
            26 - abs(x - input[i])
        }
        x = input[i]
    }
    return output
}

fun main() {
    println(solution("BZA"))
}