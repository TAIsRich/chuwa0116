import java.sql.Time;
import java.sql.Timestamp;

public class Ticket {
    private Vehicle v;

    private Timestamp startTime;
    private Spot mySpot;

    public Ticket(Vehicle v, Spot spot, Timestamp enterTime) {
        this.v = v;
        this.mySpot = spot;
        this.startTime = enterTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Spot getMySpot() {
        return mySpot;
    }

}
