import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    public int lotNum;
    public List<ParkingSpot> spots;

    public ParkingLot(int lotNum) {
        this.lotNum = lotNum;
        this.spots = new ArrayList<>();
        for (int i = 0; i < lotNum; i++) {
            spots.add(new ParkingSpot());
        }
    }

    public void setLotNum(int lotNum) {
        this.lotNum = lotNum;
    }

    public int getLotNum() {
        return lotNum;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() == null) {
                System.out.print("Parking success");
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        System.out.println("Parking lot is full");
        return false;
    }

    public void removeVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() != null && spot.getVehicle().getlicenseNumber().equals(vehicle.getlicenseNumber())) {
                System.out.println("The car is removed");
                spot.removeVehicle();
                break;
            }
        }
    }

}