package org.example.Task2;

public class Expr {
    public static double expr(int[] intArray, int d) {
        if (d == 0) {
            throw new IllegalArgumentException("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        } else if (intArray.length < 9) {
            throw new IllegalArgumentException("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
        }
        double result = (double) intArray[8] / d;
        System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + result);
        return result;
    }
}
