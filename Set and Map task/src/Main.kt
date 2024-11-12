fun main () {
    setTask()
    mapTask()
}

fun setTask () {
    // create Mutable Set of integers from 1 to 5
    // Add the number 6 to the set
    // Remove the number 3 from the set
    // iterate and print the set

    val mutableSet = mutableSetOf<Int>(1,2,3,4,5)
    mutableSet.add(6)
    mutableSet.remove(3)

    for (i in mutableSet) {
        println(i)
    }
}

fun mapTask () {
    // Create a mutable map of string keys to integer values with three entries.
    // Add a new key-value pair of the map.
    // Remove one key-value pair from the map.
    // iterate and print the map

    val mutableMap = mutableMapOf(1 to "first", 2 to "second", 3 to "third")
    mutableMap.remove(2)
    mutableMap[4] = "fourth"

    for ((i,j) in mutableMap) {
        println("$i, $j")
    }

}