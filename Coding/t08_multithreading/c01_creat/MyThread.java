package com.chuwa.tutorial.t08_multithreading.c01_creat;


public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread using extends thread");
    }
}
