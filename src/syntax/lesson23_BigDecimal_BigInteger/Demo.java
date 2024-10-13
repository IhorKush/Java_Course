package syntax.lesson23_BigDecimal_BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {

    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal("342345364747474.746464646464647");
        BigDecimal number2 = BigDecimal.valueOf(353636373.34342234442);

        BigDecimal sum = number1.add(number2);
        BigDecimal tax = sum.multiply(new BigDecimal("0.13"));

        System.out.println("Total salary: " + sum);
        System.out.println("Tax: " + tax);

        System.out.println();

        BigInteger number3 = new BigInteger("3423543535235245363");
        BigInteger number4 = BigInteger.valueOf(552526363);

        BigInteger difference = number3.subtract(number4);
        System.out.println("number3 - number4 = " + difference);

    }
}
