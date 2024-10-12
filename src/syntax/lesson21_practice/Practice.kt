package syntax.lesson21_practice

fun main() {

    println("The winner is ${getWinner(300, 320, 280, 310)}")

}

fun getWinner(
    gryffindorPoints: Int, slytherinPoints: Int,
    ravenclawPoints: Int, hufflepuffPoints: Int
): String {

    return if (gryffindorPoints > slytherinPoints
        && gryffindorPoints > ravenclawPoints
        && gryffindorPoints > hufflepuffPoints
    ) {
        "Gryffindor!"
    } else if (slytherinPoints > gryffindorPoints
        && slytherinPoints > ravenclawPoints
        && slytherinPoints > hufflepuffPoints
    ) {
        "Slytherin!"
    } else if (ravenclawPoints > gryffindorPoints
        && ravenclawPoints > slytherinPoints
        && ravenclawPoints > hufflepuffPoints
    ) {
        "Ranerclaw!"
    } else {
        "Hufflepuff!"
    }
}