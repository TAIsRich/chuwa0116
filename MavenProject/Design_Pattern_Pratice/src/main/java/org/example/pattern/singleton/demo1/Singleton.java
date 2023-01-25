package org.example.pattern.singleton.demo1;

/**
 * Eager Initialization
 */
public class Singleton {
    //1. private constructor
    private Singleton(){}
    //2. Create object of the class inside the class
    private static Singleton instance = new Singleton();
    //3. Provide a public access method to get the instance outside the class
    public static Singleton getInstance(){
        return instance;
    }
}
