package com.chuwa.learn.pattern.singleton.demo2;

public class Singleton {
    private Singleton() {};

    private static Singleton instance;

    //在静态代码块中惊醒赋值
    static{
        instance = new Singleton();
    }

    //对外提供获取该类对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
