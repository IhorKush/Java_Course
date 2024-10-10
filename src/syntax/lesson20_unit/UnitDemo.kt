package syntax.lesson20_unit

fun main() {

    var multiply: (Int, Int) -> Unit = { a, b -> println("a * b = ${a * b}") }

    multiply(4, 8)

}