package org.example.Task4;

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("В ячейке " + i + "х" + j + " лежат неверные данные.");
    }

    public MyArrayDataException() {
    }

    public MyArrayDataException(String s) {
        super(s);
    }
}