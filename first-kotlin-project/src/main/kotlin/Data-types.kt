/*
* Type              Bits
* Double            64
* Float             32
* Long              64
* Int               32
* Short             16
* Byte              8
* Boolean           0/1
* String            any
* Char              ?
*/

fun main() {
    var c: Char = 'a'
    var s: String = "xxxxxx"
    var b: Boolean = false
    var db: Double = 10.0
    var fl: Float = 5f
    var lg: Long = 10L


    println("Double - MAX: ${Double.MAX_VALUE} - MIN: ${Double.MIN_VALUE}")
    println("Float - MAX: ${Float.MAX_VALUE} - MIN: ${Float.MIN_VALUE}")
    println("Long - MAX: ${Long.MAX_VALUE} - MIN: ${Long.MIN_VALUE}")
    println("Int - MAX: ${Int.MAX_VALUE} - MIN: ${Int.MIN_VALUE}")
    println("Short - MAX: ${Short.MAX_VALUE} - MIN: ${Short.MIN_VALUE}")
    println("Byte - MAX: ${Byte.MAX_VALUE} - MIN: ${Byte.MIN_VALUE}")
}