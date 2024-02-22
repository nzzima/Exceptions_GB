package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        checkNull(list);
    }
    public static void checkNull(List<Integer> list){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == null)
                sb.append(i).append(" ");
        }
        if(!sb.isEmpty())
            throw new RuntimeException(String.valueOf(sb));
    }
}
