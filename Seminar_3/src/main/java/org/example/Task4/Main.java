package org.example.Task4;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String[][] array2 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String[][] array3 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "ihhi", "4"}};

        System.out.println(sumArray(array1));
        try {
            System.out.println(sumArray(array2));
        }catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumArray(array3));
        }catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int sumArray(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array.length != 4 || array[i].length != 4) {
                throw new MyArraySizeException("Массив не формата 4х4");
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
