import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

//https://gist.github.com/andersonmo/753868a35ca08746381c2117b4545897
fun solution(dates: Array<String>): MutableList<String> {
    val outputDate: MutableList<String> = ArrayList()
    try {
        for (tempStr in dates) {
            val tempStr = tempStr.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "")
            val tempDate = SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).parse(tempStr)
            val df: DateFormat = SimpleDateFormat("yyyy-MM-dd")
            val tempC = Calendar.getInstance()
            tempC.time = tempDate
            val year = tempC[Calendar.YEAR]
            if (year in 1900..2100) {
                val dateStr = df.format(tempDate).toString()
                outputDate.add(dateStr)
            } else {
                println("Year out of range")
            }
        }
    } catch (ex: Exception) {
        println(ex)
    }
    return outputDate
}

fun main() {
    val arr = arrayOf(
        "20th Oct 2052",
        "6th Jun 1933",
        "26th May 1960",
        "20th Sep 1958",
        "16th Mar 2068",
        "25th May 1912",
        "16th Dec 2018",
        "26th Dec 2061",
        "4th Nov 2030",
        "28th Jul 1963"
    )
    println(solution(arr))
}