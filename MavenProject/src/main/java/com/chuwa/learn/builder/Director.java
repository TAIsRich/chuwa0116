package com.chuwa.learn.builder;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 19:00
 */
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