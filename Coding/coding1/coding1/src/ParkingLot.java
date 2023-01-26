import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int availableSpots;

    private List<Row> rows;

    private float hourlyRate;

    private int availableCount;

    public ParkingLot(List<Row> rows, int availableCount, int hourlyRate) {
        this.rows = rows;
        this.hourlyRate = hourlyRate;
    }

    public int getAvailableCount() {
        availableSpots = 0;
        for (Row r: rows){
                availableSpots += r.getAvailableCount();
        }
        return availableSpots;
    }

    public List<Spot> findSpotsForVehicle(Vehicle v){

        List<Spot> spots = new ArrayList<>();

        for(Row r: rows){
            for (Spot s: r.getSpots()){
                if(s.isAvailable()){
                    spots.add(s);
                }
            }
        }
        return spots;
    }

    public Ticket parkVehicle(Vehicle v){
        List<Spot> spots = findSpotsForVehicle(v);

        List
        Time startTime = 0;
        Ticket ticket = new Ticket(v, spots, startTime);

        return ticket;
    }

    public void clearSpot(Ticket t){
        float fee = calculatePrice(Ticket t);
        updateAvailableCount(t.getVehicle().getSize());
        for (Spot s: t.getSpots()){
            s.leaveSpot();
        }

    }

    public void updateAvailableCount(int diff){
        availableCount = availableCount + diff;
    }

    public float calculatePrice(Ticket t){
        int duration = getcurrentTime() - t.getStartTime();
        float fee = duration * hourlyRate;
        return fee;
    }
}
