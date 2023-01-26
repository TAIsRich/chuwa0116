package org.example.pattern.singleton.demo2;

/**
 * Eager Initialization
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance; //null
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
