package designPattern.builder;

public class MobileBuilder extends Builder {

    public void buildFrame() {
        bike.setFrame("carbon frame");
    }

    public void buildSeat() {
        bike.setSeat("leather seats");
    }

    public Bike createBike() {
        return bike;
    }
}
