fun main() {
    println(calculateMedia(8.5f, 3.4f, 12.7f))
}

fun calculateMedia(vararg notes: Float): Float {
    var sum = 0f
    for (n in notes) {
        sum += n
    }
    return (sum / notes.size)
}