fun main() {
    val s: String? = null
    try {
        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variável nula")
    } finally {
        print("Finally ")
    }
}