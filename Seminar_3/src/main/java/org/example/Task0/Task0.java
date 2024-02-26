package org.example.Task0;

import org.example.Task2.Count;

public class Task0 {
    public static void main(String[] args) {
        try (Count counter = new Count()) {
            counter.add();
            System.out.println("counter: " + counter.getCount());
            counter.close();
            System.out.println("counter: " + counter.getCount());
            counter.add();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
