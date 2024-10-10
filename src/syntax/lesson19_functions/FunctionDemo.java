package syntax.lesson19_functions;

public class FunctionDemo {

    public static void main(String[] args) {

        System.out.println("The sum of numbers 15 and 35 is " + sumOfNumbers(15, 35));
        System.out.println("The sum of numbers 37 and 23 is " + sumOfNumbers(37, 23));

    }

    public static long sumOfNumbers(int a, int b) {

        return a + b;
    }
}
