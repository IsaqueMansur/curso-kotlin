fun main() {
    val str = "String"

    println("Tamanho da string: ${str.length}")

    println("Index 0 da string: ${str[0]}")

    println("Verificar início: ${str.startsWith("Str")}")

    println("Verificar final: ${str.endsWith("ng")}")

    println ("Capturar (substring) string por range: ${str.substring(1, 4)}")

    println ("Replace: ${str.replace("Str", "Pa")}")

    println ("LowerCase: ${str.lowercase()}")

    println ("UpperCase: ${str.uppercase()}")

    println("Trim: ${"    teste teste   ".trim()}")
}