package com.chuwa.learn.builder;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 19:01
 */
public abstract class Builder {
    //声明Bike类型的变量
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
