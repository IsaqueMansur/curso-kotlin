fun main() {
    val listOfInts: List<Int> = listOf(1, 2, 3)
    val mutableListOfInts: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    println(listOfInts.size)
    mutableListOfInts.add(8)
    println(mutableListOfInts)
    mutableListOfInts.remove(8)
    mutableListOfInts.removeAt(0)
    println(mutableListOfInts)
    println(listOfInts.contains(2))
}