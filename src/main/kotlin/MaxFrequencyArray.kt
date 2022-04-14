import java.util.*

fun maxFreqArray(arr: IntArray): Int {
    val map: MutableMap<Int, Int> = HashMap()
    for (key in arr) {
        if (map.containsKey(key)) {
            map[key] = map[key]!! + 1
        } else {
            map[key] = 1
        }
    }
    var maxCount = 0
    var res = -1
    for ((key, value) in map) {
        if (maxCount < value) {
            res = key
            maxCount = value
        }
    }
    return res
}

fun main() {
    val arr = intArrayOf(2, 1, 2, 2, 1, 3)
    println(maxFreqArray(arr))
}

