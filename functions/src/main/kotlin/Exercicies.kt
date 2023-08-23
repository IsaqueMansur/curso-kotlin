fun main() {
    println(returnTimesPerYears(2.05f))
    println(convertMilesToKm(10f))
}

fun returnTimesPerYears(years: Float): String {
    val months = years * 12
    val days = years * 365
    val hours = days * 24
    val minutes = (hours * 60).toInt()
    val seconds = (minutes * 60)

    return "Months: $months, Days: $days, Hours: $hours, Minutes: $minutes, Seconds: $seconds"
}

fun convertMilesToKm(miles: Float) = miles * 1.6
