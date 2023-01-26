package com.chuwa.learn.pattern.builder.demo1;

public class Director {
    //指挥者类
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
