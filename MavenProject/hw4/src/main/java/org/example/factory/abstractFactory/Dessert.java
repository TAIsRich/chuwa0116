package org.example.factory.abstractFactory;

public abstract class Dessert {

    private String name;
    Dessert(String name) {
        this.name = name;
        System.out.println("Order a piece of " + name);
    }
}
