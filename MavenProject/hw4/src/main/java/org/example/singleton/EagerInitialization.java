package org.example.singleton;

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private EagerInitialization(){}

    public EagerInitialization getInstance(){
        return instance;
    }
}
