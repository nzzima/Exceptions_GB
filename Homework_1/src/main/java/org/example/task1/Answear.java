package org.example.task1;

public class Answear {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[5];
        for (int i = 0; i < 7; i++) {
            array[i] += 1;
        }
    }

    public static void divisionByZero() {
        int number = 5;
        int result = number / 0;
    }

    public static void numberFormatException() {
        int aIntPrim = Integer.parseInt("two");
    }
}
