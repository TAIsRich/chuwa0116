package oop.builder;

public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildSeat();

    public abstract void buildFrame();

    public abstract Bike createBike();
}
