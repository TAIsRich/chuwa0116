package oop.factory.abstractFactory;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk(){ System.out.println("Add Milk"); }

    public void addSugar(){ System.out.println("Add Sugar"); }
}
