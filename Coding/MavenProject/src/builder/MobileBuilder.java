package builder;

public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
