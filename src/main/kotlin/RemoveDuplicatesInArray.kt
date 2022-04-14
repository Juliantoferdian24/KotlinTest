fun removeDuplicates(a: Array<Int>) : Array<Int> {
    val set = LinkedHashSet<Int>()

    // adding elements to LinkedHashSet
    for (i in a.indices) set.add(a[i])

    // Print the elements of LinkedHashSet
    return set.toTypedArray()
}

fun main(){
    val array = arrayOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10)
    val result = removeDuplicates(array)
    println(result.contentToString())
}
