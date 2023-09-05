interface Event {
    fun onSuccess()
}

class Program {
    fun save(e: Event) {
        println("Abrindo conexão")
        println("Salvando valores")
        println("Finalizando")
        e.onSuccess()
    }
}

fun main() {
    val p = Program()
    p.save(object : Event {
        override fun onSuccess() {
            println("Dados salvos com sucesso")
        }
    })
}