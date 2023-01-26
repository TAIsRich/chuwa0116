package designPattern.builder;

public class OfoBuilder extends Builder{

    public void buildFrame() {
        bike.setFrame("ofo frame");
    }

    public void buildSeat() {
        bike.setSeat("ofo seat");
    }

    public Bike createBike() {
        return bike;
    }
}
