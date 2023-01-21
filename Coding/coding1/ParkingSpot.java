public class ParkingSpot {
    private int size;
    private Vehicle vehicle;

    public ParkingSpot(int size) {
        this.size = size;
        this.vehicle = null;
    }

    public int getSize() {
        return size;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }
}