import java.util.List;

public class ParkingLot {
    private List<Spot> spots;

    private int availableCount;

    public ParkingLot(List<Spot> spots, int availableCount) {
        this.spots = spots;
        this.availableCount = availableCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public List<Spot> findSpotsForVehicle(Vehicle v){
        return null;
    }

    public Ticket parkVehicle(Vehicle v){
        Ticket ticket = new Ticket();

        return ticket;
    }

    public void clearSpot(Ticket t){

    }

    public void updateAvailableCount(int diff){

    }
}
