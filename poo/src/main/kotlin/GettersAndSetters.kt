class Planet {
 var name: String = "Planeta-Pão"
     get() {
         return field
     }
     set(value) {
         field = value
     }
}

fun main() {
    val planet1 = Planet();
    println(planet1.name)
    planet1.name = "Planetão Pão"
    println(planet1.name)
}