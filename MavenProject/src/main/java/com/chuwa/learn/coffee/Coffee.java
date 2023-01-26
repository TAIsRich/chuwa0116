package com.chuwa.learn.coffee;

public abstract class Coffee {

    public abstract String getName();

    // add sugar
    public void addSugar(){
        System.out.println("add sugar");
    }

    // add milk
    public void addMilk(){
        System.out.println("add milk");
    }
}
