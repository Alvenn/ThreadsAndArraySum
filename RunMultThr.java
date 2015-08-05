package com.gmail.alvenn89;

import java.util.Random;

public class RunMultThr {
    public static void main(String[] args) {
        int[] a = new int[400];
        Thread[] threads = new Thread[10];
        Random rn = new Random();
        for (int i = 0; i < 400 ; i++) {
            a[i] = rn.nextInt(20);
        }

        for (int i = 0; i < 10 ; i++) {
            threads[i] = new Thread(new MultipleThread(i+1, a));
            threads[i].start();
        }
    }
}
