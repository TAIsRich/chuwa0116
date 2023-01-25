package com.example.design_pattern;

// eager load
public class singleton {
    // 1. private constructor
    private singleton() {}

    // 2. static private class instance
    static private singleton instance = new singleton();

    // 3. getinstance method
    public static singleton getinstance() {
        return instance;
    }
}
