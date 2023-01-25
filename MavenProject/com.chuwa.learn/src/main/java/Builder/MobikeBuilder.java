package Builder;

public class MobikeBuilder extends Builder {

  @Override
  public Bike createBike() {
    return bike;
  }

  @Override
  public void buildFrame() {
    bike.setFrame("A");
  }

  @Override
  public void buildSeat() {
    bike.setSeat("B");
  }
}
