interface Contribuitor {
    var salary: Float
    fun getBonus(): Float
}

class Leader(name: String): Contribuitor {
    override var salary: Float = 4000f
    override fun getBonus(): Float {
        return salary * 0.3f
    }
}

class Analyst(name: String): Contribuitor {
    override var salary: Float = 2500f
    override fun getBonus(): Float {
        return salary * 0.2f
    }
}

fun seeBonus(contribuitor: Contribuitor) {
    println(contribuitor.getBonus())
}

fun main() {
    seeBonus(Leader("Líder"))
    seeBonus(Analyst("Analista"))
}