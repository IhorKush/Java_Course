package syntax.lesson22_switch_when

fun main() {
println(getWinner(25, 30, 28, 26))
}

fun getWinner(
    gryffindorPoints: Int, slytherinPoints: Int,
    ravenclawPoints: Int, hufflepuffPoints: Int
): String {

    val maxPoints = maxOf(gryffindorPoints, slytherinPoints, ravenclawPoints, hufflepuffPoints)

    return when (maxPoints) {
        gryffindorPoints -> "Gryffindor"
        slytherinPoints -> "Slytherin"
        ravenclawPoints -> "Ravenclaw"
        else -> "Hufflepuff"
    }

}
