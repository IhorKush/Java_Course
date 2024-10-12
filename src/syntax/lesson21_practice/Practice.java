package syntax.lesson21_practice;

public class Practice {
    public static void main(String[] args) {

        System.out.println("The winner is " + getWinner(230, 220, 190, 200));

    }

    public static String getWinner(int gryffindorPoints, int slytherinPoints, int ravenclawPoints, int hufflepuffPoints) {

        if (gryffindorPoints > slytherinPoints && gryffindorPoints > ravenclawPoints && gryffindorPoints > hufflepuffPoints) {
            return "Gryffindor!";
        } else if (slytherinPoints > gryffindorPoints && slytherinPoints > ravenclawPoints && slytherinPoints > hufflepuffPoints) {
            return "Slytherin!";
        } else if (ravenclawPoints > gryffindorPoints && ravenclawPoints > slytherinPoints && ravenclawPoints > hufflepuffPoints) {
            return "Ravenclaw!";
        } else {
            return "Hufflepuff!";
        }
    }
}
