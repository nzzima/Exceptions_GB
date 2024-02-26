package org.example.Task2;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            d = 0;
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}
