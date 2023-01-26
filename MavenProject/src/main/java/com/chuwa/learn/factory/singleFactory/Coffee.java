package com.chuwa.learn.factory.singleFactory;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 18:57
 */
public abstract class Coffee {
    public abstract String getName();

    public void addsugar(){
        System.out.println("加糖");
    }

    public void addmilk(){
        System.out.println("加奶");
    }

}