package org.example.MyExceptions;

public class CheckGenderFormatException {
    final static String GENDER_MALE = "m";
    final static String GENDER_FEMALE = "f";

    public boolean isGenderValid(String gender) {
        if (gender.equals(GENDER_MALE) || gender.equals(GENDER_FEMALE)) {
            return true;
        } else {
            throw new RuntimeException("Введенный гендер не соответствует формату ('m' или 'f')");
        }
    }
}
