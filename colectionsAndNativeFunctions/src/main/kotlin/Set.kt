fun main() {
    val setOfInts: Set<Int> = setOf(1, 2, 3)
    val mutableSetOfInts: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
    println(setOfInts.size)
    mutableSetOfInts.add(8)
    println(mutableSetOfInts)
    mutableSetOfInts.remove(8)
    println(mutableSetOfInts)
    println(setOfInts.contains(2))
}