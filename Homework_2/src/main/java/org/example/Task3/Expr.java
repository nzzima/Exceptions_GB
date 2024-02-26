package org.example.Task3;

public class Expr {
    public static double expr(int a, int b) {
        printSum(a, b);
        if (b == 0) {
            return 0;
        } else {
            return (double) a / b;
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
