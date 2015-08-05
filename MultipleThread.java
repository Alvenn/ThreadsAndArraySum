package com.gmail.alvenn89;

import sun.rmi.runtime.RuntimeUtil;

public class MultipleThread implements Runnable{
    int number;
    int[] array;

    public MultipleThread(int number, int[] array) {
        this.number = number;
        this.array = array;
    }

    public int summ(){
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % number == 0){
                res = res + array[i];
            }
        }
        return res;
    }

    @Override
    public void run() {
        System.out.println("I'm thread number " + number + " my summ is " + summ());

    }
}
