fun main(){
    print(repeatedString("aba", 10))
}

fun repeatedString(s: String, n: Long) : Long {
    if(s == "a") return n
    val times = n / s.length.toLong()
    val remainder = n % s.length.toLong()
    val modifiedString = s.repeat(times.toInt()) + s.substring(0 , remainder.toInt())
    return modifiedString.filter {it == 'a'}.count().toLong()
}