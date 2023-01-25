package org.example.builder;

public abstract class Builder {
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public Bike getBike(){
        return bike;
    }
}
