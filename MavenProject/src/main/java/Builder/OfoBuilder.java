package Builder;

public class OfoBuilder extends Builder {
    @Override
    public void buildSeat() {
        bike.setSeat("C");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("D");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}