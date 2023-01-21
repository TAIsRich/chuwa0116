package coding1;

public class Client {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3, 5, 2, 1);
        Vehicle vehicle = new Car("abc123");
        parkingLot.getParkingPosition(vehicle);
        parkingLot.freeParkingPosition(0, 0, vehicle);
    }
}
