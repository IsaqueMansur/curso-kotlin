abstract class ZooAnimal(val name: String, val colorEyes: ColorEyes, val weight: Float) {
    open fun getAnimalInfos(): String {
        return "\r\nNome: $name\r\nCor dos olhos: $colorEyes\r\nPeso: $weight"
    }
}

interface Salvage {
    fun attack(): String
}

class Elephant(name: String, colorEyes: ColorEyes, weight: Float, val hasHorns: Boolean) :
    ZooAnimal(name, colorEyes, weight), Salvage {

    companion object {
        val animalType = "Elephant"
    }

    override fun getAnimalInfos(): String {
        return super.getAnimalInfos() + "\r\nPossui chifres: ${if (hasHorns) "Sim" else "Não"}"
    }

    override fun attack(): String {
        return "$animalType ($name) está atacando !"
    }
}

fun main() {
    val elephant1 = Elephant("Stuart", ColorEyes.Castanhos, 492.87f, true)
    println(elephant1.getAnimalInfos())
    println(Elephant.animalType)
    println(elephant1.attack())
}