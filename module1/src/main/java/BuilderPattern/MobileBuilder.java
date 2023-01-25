package BuilderPattern;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("frame1");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("seat1");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
