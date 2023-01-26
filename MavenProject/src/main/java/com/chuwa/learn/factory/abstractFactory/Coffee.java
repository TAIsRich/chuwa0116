package com.chuwa.learn.factory.abstractFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:48
 */
public abstract  class Coffee{
    public abstract String getName();
    public void addSugar(){
        System.out.println("add sugar");
    }
    public void addMilk(){
        System.out.println("add milk");
    }
}
