import java.sql.Time;
import java.util.List;

public class Ticket {
    private Vehicle vehicle;

    private List<Spot> spots;

    private Time startTime;

    public Vehicle getVehicle() {
        return v;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public Time getStartTime() {
        return startTime;
    }
}
