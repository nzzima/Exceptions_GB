package org.example.MyExceptions;

public class MyValuesCountException extends ArrayIndexOutOfBoundsException {
    public MyValuesCountException() {
    }

    public MyValuesCountException(String s) {
        super(s);
    }
}
