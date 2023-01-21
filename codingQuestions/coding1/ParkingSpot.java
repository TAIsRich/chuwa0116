package coding1;

public abstract class ParkingSpot {
    private boolean isEmpty;
    private Vehicle vehicle;
    private int id;
    private ParkingSpotType parkingSpotType;
    ParkingSpot(ParkingSpotType parkingSpotType, int id){
        this.parkingSpotType = parkingSpotType;
        this.id = id;
        isEmpty = true;
    }
    boolean isEmpty(){
        return isEmpty;
    }

    void park(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
    }

    void unpark(){
        isEmpty = true;
        vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
