import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParkingLot {
    private int limitations;
    //private Set<Vehicle> parking;

    private Map<String, Vehicle> vehicles;
    private int totalVehicle;
    public ParkingLot(int numOfLots){
        totalVehicle = 0;
        //this.parking = new HashSet<>();
        this.limitations = numOfLots;
        this.vehicles = new HashMap<>();
    }
    public int getTotalVehicle() {
        return totalVehicle;
    }

    public Map<String, Vehicle> getVehicles(){
        return this.vehicles;
    }

    public void addVehicle(){
        totalVehicle++;
    }

    public void reduceVehicle(){
        totalVehicle--;
    }

    public int getLimitations(){
        return limitations;
    }
}
