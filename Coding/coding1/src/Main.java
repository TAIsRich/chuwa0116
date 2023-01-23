public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(10);
        Vehicle car1 = new Car("ABC123");
        Vehicle car2 = new Car("DEF456");
        Vehicle bus1 = new Bus("GHI789");

        System.out.println("Parking car1: " + lot.parkVehicle(car1));
        System.out.println("Parking car2: " + lot.parkVehicle(car2));
        System.out.println("Parking bus1: " + lot.parkVehicle(bus1));

        System.out.println("Removing car1: ");
        lot.removeVehicle(car1);

        System.out.println("Parking car1 again: " + lot.parkVehicle(car1));

    }
}
