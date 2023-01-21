import java.sql.Time;
import java.util.List;

public class Ticket {
    private Vehicle v;

    private List<Spot> spots;

    private Time startTime;

    public Vehicle getV() {
        return v;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public Time getStartTime() {
        return startTime;
    }
}
