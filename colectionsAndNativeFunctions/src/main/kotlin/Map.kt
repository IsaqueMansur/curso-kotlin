fun main() {
    val map1 = mapOf<String, Int>(
        Pair("Três Pontas", 37190000),
        Pair("Varginha", 37002070)
    )

    val map2 = mutableMapOf<String, Int>(
        Pair("Três Pontas", 37190000),
        Pair("Varginha", 37002070)
    )

    map2["Três Corações"] = 37945627

    println(map1)
    println(map2)
    map2.remove("Três Pontas")
    println(map2)
    println("Keys:    ${map2.entries} \r\nValores: ${map2.values}")
}