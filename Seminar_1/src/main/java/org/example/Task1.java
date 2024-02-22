package org.example;

public class Task1 {
    public static void main(String[] args) {
        int[] test = new int[16];
        System.out.println(checkArray(test, 15));
    }

    private static int checkArray(int[] array, int minLen) {
        if(array.length < minLen)
            return -1;
        return array.length;
    }
}
