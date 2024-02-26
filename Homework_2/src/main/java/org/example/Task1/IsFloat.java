package org.example.Task1;

public class IsFloat {
    public static float isFloat(String input) {
        try {
            float value = Float.parseFloat(input);
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }
}
