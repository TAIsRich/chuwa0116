package Builder;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/25/23
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
