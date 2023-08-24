fun verifyOfLegalAge(age: Int): Boolean {
    if (age >= 18) return true
    return false
}

fun returnInfoPerAge(age: Int): String {
    if (age < 18) {
        return "Menor de idade"
    } else if (age in 18..59) {
        return "Adulto"
    }
    return "Terceira idade"
}

fun returnExpression(info: Boolean): String {
    return if (info) {
        "Verdadeiro"
    } else {
        "Falso"
    }
}

fun main() {
    println(verifyOfLegalAge(18))
    println(returnInfoPerAge(17))
    println(returnExpression(false))
}