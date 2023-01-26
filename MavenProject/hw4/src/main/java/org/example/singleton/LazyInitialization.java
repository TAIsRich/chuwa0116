package org.example.singleton;

public class LazyInitialization {
    private static LazyInitialization instance;
    private LazyInitialization(){}

    public LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}
