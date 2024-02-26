package org.example.Task4;

public class Printer {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = 'J';
        } else {
            a = args[0].charAt(0);
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
