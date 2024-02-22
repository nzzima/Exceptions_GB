package org.example.task3;

public class Answear {
    public int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[]{0};
        } else {
            int[] c = new int[a.length];
            try {
                for (int i = 0; i < c.length; i++) {
                    c[i] = a[i] / b[i];
                }
            } catch (RuntimeException error){
                System.out.println("На ноль делить нельзя!");
            }
            return c;
        }
    }
}
