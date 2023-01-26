package com.chuwa.learn.singleton;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 15:49
 */
public class SingletonExample {

}

//eager load
class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

}

//lazy load
class Singleton1{
    private  static volatile  Singleton1 instance;

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if(instance == null){
            synchronized (Singleton1.class){
                if (instance == null){
                    instance = new Singleton1();
                }
            }
        }

        return  instance;
    }
}