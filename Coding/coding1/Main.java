public class Main {
    public static void main(String[] args){

        ParkingLot p = new ParkingLot();

        Car car1 = new Car("AK0905");
        Bus bus1 = new Bus("T87652");

        p.tryParkVehicle(car1);
        p.tryParkVehicle(bus1);
    }
}

