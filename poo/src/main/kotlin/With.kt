fun main() {
    val people1 = People(ColorEyes.Castanhos, "Isaque", "Mansur")

    with(people1) {
        //O this já é autoreferido
        money = 1500f
        println(money)
        sleep()
    }
}