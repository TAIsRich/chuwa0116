package com.chuwa.learn.builder;

/**
 * @author Zhipeng Yin
 * @date 2023-01-25 19:00
 */
public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}