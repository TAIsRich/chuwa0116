package com.example.design_pattern;

public class lazyload_singleton {

    private static lazyload_singleton instance;

    private lazyload_singleton() {}

    private static synchronized lazyload_singleton getInstance() {
        if (instance == null) {
            instance = new lazyload_singleton();
        }
        return instance;
    }
}
