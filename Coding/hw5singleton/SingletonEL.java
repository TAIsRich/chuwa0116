package Coding.hw5singleton;

public class SingletonEL {
    private static SingletonEL instance = new SingletonEL();

    private SingletonEL(){

    }

    public static SingletonEL getInstance(){
        return instance;
    }

}
