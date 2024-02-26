package org.example.Task4;

public class Expr {
    public static String expr(char a) throws Exception {
        if (a == ' ') {
            throw new IllegalArgumentException("Empty string has been input.");
        } else {
            return "Your input was - " + a;
        }
    }
}
