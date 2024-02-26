package org.example.Task3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        createFile();
        readFile(filename);
        writeToFile(readFile(filename));
    }

    final static String filename = "newFIle.txt";

    public static void createFile() {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("Анна = 4\n");
            writer.write("Елена = 5\n");
            writer.write("Марина = 6\n");
            writer.write("Владимир = ?\n");
            writer.write("Константин = ?\n");
            writer.write("Иван = 4\n");
        } catch (IOException error) {
            System.out.println(error);
        }
    }

    static HashMap<String, Integer> readFile(String filename) throws IOException{
        HashMap<String, Integer> hashMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            try {
                String[] arraySplit = line.split(" = ");
                if(arraySplit[1].equals("?")) {
                    //arraySplit[1] = String.valueOf(arraySplit[0].length());
                    hashMap.put(arraySplit[0], arraySplit[0].length());
                    throw new questionMarkInsteadNumberException("Значение равно '?'");
                }
                Integer number = Integer.parseInt(arraySplit[1]);
                hashMap.put(arraySplit[0], number);
            } catch (NumberFormatException error) {
                System.out.println(error);
            } catch (questionMarkInsteadNumberException error) {
                System.out.println(error);
            }
        }
        return hashMap;
    }

    static void writeToFile(HashMap<String, Integer> hashMap) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> element : hashMap.entrySet()) {
            stringBuilder.append(element.getKey() + " = " + element.getValue() + "\n");
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(filename);
            writer.write(stringBuilder.toString());
        } catch (IOException error) {
            System.out.println(error);
        } finally {
            writer.close();
        }

    }
}
