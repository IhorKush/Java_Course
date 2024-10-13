package collections

fun main() {

    val arrNumbers: Array<Int> = arrayOf(4, 12, 76, 48, 55, 23)
    val arrNumbers2 = IntArray(5)

    println("The size of arrNumbers2 is ${arrNumbers2.size}.")

    for (num in arrNumbers) {
        println(num)
    }
}