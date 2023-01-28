package com.chuwa.tutorial.t01_basic.generic;


public class GenericClass<T> {
    // T -> Integer, User, Product
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
