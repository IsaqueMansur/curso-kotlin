fun bonusPerOffice(office: String): Float {
    when (office) {
        "Gerente" -> return 2000f
        "Coordernador" -> return 1500f
    }
    return 500f
}

fun main() {
    println(bonusPerOffice("Porteiro"))
    println(bonusPerOffice("Gerente"))
}