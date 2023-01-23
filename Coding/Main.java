public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(2);
        Vehicle vehicle1 = new Vehicle("123");
        Vehicle vehicle2 = new Vehicle("456");
        Vehicle vehicle3 = new Vehicle("789");

        System.out.println("Parking vehicle1: " + lot.parkVehicle(vehicle1));
        System.out.println("Parking vehicle2: " + lot.parkVehicle(vehicle2));
        System.out.println("Parking vehicle3: " + lot.parkVehicle(vehicle3));// output parking lot is full since lotNum
                                                                             // = 2
        System.out.print("Removing vehicle1: ");
        lot.removeVehicle(vehicle1);
        System.out.println("Parking vehicle3: " + lot.parkVehicle(vehicle3));// able to park again

    }
}