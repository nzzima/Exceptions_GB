package org.example;

import org.example.MyExceptions.CheckDateFormatException;
import org.example.MyExceptions.CheckGenderFormatException;
import org.example.MyExceptions.CheckPhoneFormatException;
import org.example.MyExceptions.MyValuesCountException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String[] arrayUserValues = {};
    public static void main(String[] args) {
        enterValues();
        checkParsedValues();
        writeToFile();
    }

    public static void enterValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные согласно формату(Без <>, через пробел):\n" +
                           "<Фамилия> <Имя> <Отчество> <Дата рождения> <Номер телефона> <Пол>");
        String userValues = scanner.nextLine();
        arrayUserValues = userValues.split(" ");
        if (arrayUserValues.length < 6) {
            throw new MyValuesCountException("Вы ввели меньше значений, чем требуется.");
        } else if (arrayUserValues.length > 6) {
            throw new MyValuesCountException("Вы ввели больше значений, чем требуется.");
        }
    }

    public static void checkParsedValues() {
        CheckDateFormatException checkDateFormat = new CheckDateFormatException();
        boolean checkDate = checkDateFormat.isDateValid(arrayUserValues[3]);

        if(arrayUserValues[4].contains("(") || arrayUserValues[4].contains(")") || arrayUserValues[4].contains("+") ||
           arrayUserValues[4].contains("-") || arrayUserValues[4].contains(".")) {
            throw new CheckPhoneFormatException("Введеный номер телефона не соответствует формату");
        }

        CheckGenderFormatException checkGenderFormatException = new CheckGenderFormatException();
        boolean checkGender = checkGenderFormatException.isGenderValid(arrayUserValues[5]);
    }

    public static void writeToFile() {
        try (FileWriter fileWriter = new FileWriter(arrayUserValues[0], true)) {
            StringBuilder userValues = new StringBuilder();
            for (String arrayUserValue : arrayUserValues) {
                userValues.append(arrayUserValue).append(" ");
            }
            fileWriter.write(userValues.toString());
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
