package org.example.designPattern.builder.demo;

public abstract class Builder {
    //声明Bike类型的变量 并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
