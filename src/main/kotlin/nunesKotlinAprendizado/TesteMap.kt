package nunesKotlinAprendizado

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (x, y) -> println("Chave: $x \nValor: $y") }

    println("/////////////////////////////////////////")
    val map2 = mapOf(
        "Pedro" to 2000.0,
        "Maria" to 3000.0
    )
    map2.forEach { (x, y) -> println("Chave: $x \nValor: $y") }
}