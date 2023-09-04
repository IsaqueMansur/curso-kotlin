class Player(val level: Int) {
    private lateinit var instructions: String

    private fun generateInstructionsForBeginner() {
        instructions = "Olá, iniciante. Faça (coisas de inciante)"
    }

    private fun generateInstructionsForOlder() {
        instructions = "Olá, Veiaco. Faça (coisas de veiaco)"
    }

    fun setInstructions() {
        if (level < 10) {
            return generateInstructionsForBeginner()
        }
        return generateInstructionsForOlder()
    }

    fun getInstructions(): String {
        return this.instructions
    }

}

fun main() {
    println("\r\nUsando o lateint na declaração das 'instructions' na classe Player, o peso na memória (criação do endereço da variável) só é criado quando seu valor é declarado 'setInstructions'\r\n")
    val player1 = Player(10)
    player1.setInstructions()
    println(player1.getInstructions())
}