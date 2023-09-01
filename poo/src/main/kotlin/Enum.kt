enum class Priority {
    Low, Normal, High
}

fun numberPerPriority(priority: Priority): Int {
    if (priority === Priority.Low) return 1
    if (priority === Priority.Normal) return 5
    return 10
}

fun main() {
    println(numberPerPriority(Priority.Low))
}