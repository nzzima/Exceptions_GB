package org.example.task2;

public class Answear {
    public int[] subArrays(int[] a, int[] b){
        if (a.length != b.length) {
            return new int[]{0};
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < c.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
    }
}
