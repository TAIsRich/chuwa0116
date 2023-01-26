package org.example.pattern.factory.simple_factory;

public abstract class Coffee {

    public abstract String getName();

    public void addsugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }


}
