package org.example.MyExceptions;

public class CheckPhoneFormatException extends NumberFormatException{
    public CheckPhoneFormatException() {
    }

    public CheckPhoneFormatException(String s) {
        super(s);
    }
}
