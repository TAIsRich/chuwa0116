public class MobileBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("abc");
    }


    public void buildFrame() {
        bike.setSeat("abc");
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
