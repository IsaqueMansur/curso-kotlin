fun main() {
    var number = 0
    while (number < 100) {
        number++
        println(number)
    }

    var number2 = 0
    while (true) {
        if (number2 == 10) break
        number2++
        if (number2 % 2 == 0) continue
        println(number2)
    }
}