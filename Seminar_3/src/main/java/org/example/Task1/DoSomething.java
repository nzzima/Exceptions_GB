package org.example.Task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DoSomething {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException {
        File file = new File("несуществующийфайл.txt");
        FileReader fileReader = new FileReader(file);
    }
}
