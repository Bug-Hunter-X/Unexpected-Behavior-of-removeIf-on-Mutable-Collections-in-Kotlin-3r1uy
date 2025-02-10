fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = list.filter { it % 2 == 0 }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it % 2 == 0 }.toSet()
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val keysToRemove = map.filter { it.key % 2 == 0 }.map { it.key }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=one, 3=three}
    
    //Alternative for Map using entries
    val map2 = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    map2.entries.removeIf { it.key % 2 == 0 }
    println(map2) // Output: {1=one, 3=three}
} 