fun main() {
    println("--- default ---")
    for (i in 1..10) {
        print(" $i ")
    }
    println("\r\n--- step ---")
    for (i in 1..10 step 2) {
        print(" $i ")
    }
    println("\r\n--- downTo ---")
    for (i in 10 downTo 1) {
        print(" $i ")
    }
    println("\r\n--- downTo with step ---")
    for (i in 10 downTo 1 step 2) {
        print(" $i ")
    }
}