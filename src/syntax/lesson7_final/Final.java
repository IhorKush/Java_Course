package syntax.lesson7_final;

public class Final {
    public static void main(String[] args) {

        final int firstInt = 4, secondInt = 8;

//        secondInt = 15;
        System.out.println("firstInt = " + firstInt + ", secondInt = " + secondInt);

        final var nameOfBoss = "Ihor Kush";
//        nameOfBoss="Ihor!";
        System.out.println(nameOfBoss);
    }
}
