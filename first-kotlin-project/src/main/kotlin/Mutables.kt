fun main() {
    var name = "Isaque" //mutable
    name = "José"

    val lastName = "Mansur" //no-mutable

    println("$name $lastName")
    println(sum(1, 2))
}

fun sum(v1: Int, v2: Int): Int {
    return v1 + v2
}