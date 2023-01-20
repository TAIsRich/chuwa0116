import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;
    private int maxSize;

    public ParkingLot(int maxSize) {
        this.maxSize = maxSize;
        this.spots = new ArrayList<>();
        for (int i = 0; i < maxSize; i++) {
            spots.add(new ParkingSpot(i));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() == null && spot.getSize() >= vehicle.getSize()) {
                System.out.println("Park " + vehicle.getLicensePlate() + " success");
                spot.parkVehicle(vehicle);
                return true;
            }
        }

        System.out.println("PARKING FULL");
        return false;
    }

    public void removeVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() != null && spot.getVehicle().getLicensePlate().equals(vehicle.getLicensePlate())) {
                System.out.println("Vehicle " + spot.getVehicle() + " " + spot.getVehicle().getLicensePlate() +" leave ");
                spot.removeVehicle();
                break;
            }
        }
    }
}
