package com.chuwa.tutorial.t08_multithreading.c01_creat;

import java.util.concurrent.Callable;

public class CallableTest {

    public static void main(String[] args) {
        final int n = 10;
        Callable<Integer> sumTask = new Callable<Integer>() {
            @Override
            public Integer call() {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        try {
            Integer call = sumTask.call();
            System.out.println(call);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }
}
