fun main(){
    println(factorial(0))
}

fun factorial(n: Int) : Int{
    var factorial = 1
    for(i in 1..n){
        factorial *= i
    }
    return factorial
}