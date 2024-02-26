package org.example.MyExceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckDateFormatException {
    final static String DATE_FORMAT = "dd.mm.yyyy";

    public boolean isDateValid(String date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (ParseException error) {
            throw new RuntimeException("Введенная дата рождения не соответсвует формату <dd.mm.yyyy>");
        }
    }
}
