data class FormData(val a: Int, val b: Int)

data class Adress(val street: String, val neighborhood: String, val number: Int)

fun seeAdress(a: Adress) {
    println(a.neighborhood)
    println(a.street)
    println(a.number)
}

fun main() {
    val f1 = FormData(10, 8)
    val f2 = FormData(10, 8)
    val f3 = f2.copy()
    println(f1.equals(f2))
    println("f3 tem o mesmo valor que f1 e f2, pois foi utilizado o método 'copy'. Valor f3: $f3")
    println("Verdadeiro, pois 'data class' utiliza o mesmo endereço de memória no caso de definições iguais, diferente de 'class'\r\n")

    val adress1 = Adress("Abóboras", "Caju", 207)
    seeAdress(adress1)
}