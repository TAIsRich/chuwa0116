package Builder;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架！");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座！");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
