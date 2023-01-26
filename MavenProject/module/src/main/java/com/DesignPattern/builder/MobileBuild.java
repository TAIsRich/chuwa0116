package com.DesignPattern.builder;

public class MobileBuild extends Builder{
    
    public void buildFrame(){
        bike.setFrame("碳纤维车架");
    }
    public void buildSeat(){
        bike.setSeat("真皮车座");
    }

    public Bike createBike(){
        return bike;
    }
}