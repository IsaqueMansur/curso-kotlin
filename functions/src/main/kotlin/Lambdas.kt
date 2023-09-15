fun main() {
    val A = { x: Int -> x * x }
    println(A(10))
    println(receiveLambda(A, 10))
}


fun receiveLambda(lambda: (x: Int) -> Int, value: Int): Int {
    return lambda(value)
}