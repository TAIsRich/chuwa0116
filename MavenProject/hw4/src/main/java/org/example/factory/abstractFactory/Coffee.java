package org.example.factory.abstractFactory;

public abstract class Coffee {
    private String name;
    Coffee(String name){
        this.name = name;
        System.out.println("Order a cup of " + name);
    }

}
