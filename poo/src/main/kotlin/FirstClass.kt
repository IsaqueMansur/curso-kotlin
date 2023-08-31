enum class ColorEyes {
    Castanhos, Pretos, Azuis, Verdes
}
class People(
    val colorEyes: ColorEyes,
    val firstName: String,
    val lastName: String
) {
    var money: Float = 0f
    fun sleep() {
        println("${this.firstName} Está dormindo (Zzzz...)")
    }
}
fun main() {
    var people1 = People(ColorEyes.Castanhos, "Isaque", "Mansur")
    people1.money = 1500.75f
    println(people1.sleep())
    println(people1.money)
}