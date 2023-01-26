package com.chuwa.learn.pattern.factory.abstract_factory;

public abstract class Coffee {
    public abstract String getName();

    public void addsugar(){
        System.out.println("加糖");
    }

    public void addmilk(){
        System.out.println("加奶");
    }

}
