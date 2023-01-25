package oop.builder;

public class OfOBuilder extends Builder{
    @Override
    public void buildSeat() {
        bike.setSeat("Yellow Seat");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("Iron Frame");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
