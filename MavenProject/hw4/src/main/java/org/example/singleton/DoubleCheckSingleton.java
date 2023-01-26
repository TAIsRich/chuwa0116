package org.example.singleton;

public class DoubleCheckSingleton {
    private volatile static  DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){};

    public DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
