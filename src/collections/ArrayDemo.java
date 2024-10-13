package collections;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arrNumbers = {4, 12, 76, 48, 55, 23};

        System.out.println(Arrays.toString(arrNumbers));
        System.out.println("The 5th element of Array is " + arrNumbers[4]);

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("The index is " + i + ", the value is " + arrNumbers[i]);
        }
    }
}
