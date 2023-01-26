package Builder;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架！");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅！");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
