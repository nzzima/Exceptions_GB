package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        findElementComment(array, 0, 6);
        findElementComment(array, 7, 4);
        findElementComment(null, 7, 4);
        findElementComment(array, 0, 4);
    }
    public static int findElement(int[] array, int value, int minlen){
        if(array == null)
            return -3;
        if(array.length < minlen)
            return -1;
        for(int i = 0; i < array.length; i++ ){
            if(array[i] == value)
                return i;
        }
        return -2;
    }
    public static void findElementComment(int[] array, int value, int minlen){
        int result = findElement(array, value, minlen);
        if(result == -1 ) {
            System.out.println("Длина массива меньше некоторого заданного минимума");
        }else if (result == -2){
            System.out.println("Искомый элемент не найден");
        }else if (result == -3)
            System.out.println("Вместо массива пришел null");
        else System.out.println("Индекс искомого элемента: " + result);
    }
}
