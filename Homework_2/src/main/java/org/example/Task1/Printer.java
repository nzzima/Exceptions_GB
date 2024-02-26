package org.example.Task1;

public class Printer {
    public static void main(String[] args) {
        String input;

        if (args.length == 0) {
            input = "3.14";
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}
