package com.chuwa.tutorial.t08_multithreading.c01_creat;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}
