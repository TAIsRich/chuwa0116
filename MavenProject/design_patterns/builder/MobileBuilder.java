package oop.builder;

public class MobileBuilder extends Builder{
    @Override
    public void buildSeat() {
        bike.setSeat("Black Seat");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("Carbon Frame");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
