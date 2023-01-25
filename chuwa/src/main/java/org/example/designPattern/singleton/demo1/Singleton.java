package org.example.designPattern.singleton.demo1;

public class Singleton {
    //私有构造方法
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
