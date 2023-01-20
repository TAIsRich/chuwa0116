import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<CompactSpot> compactSpotList = new ArrayList<>();
    List<LargeSpot> largeSpotList = new ArrayList<>();
    List<BikeSpot> bikeSpotList = new ArrayList<>();

    int freeCompactSpots;
    int freeLargeSpots;
    int freeBikeSpots;

    public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeBikeSpots) {
        this.freeBikeSpots = freeBikeSpots;
        this.freeCompactSpots = freeCompactSpots;
        this.freeLargeSpots = freeLargeSpots;
    }

    public void parkVehicle(Vehicle vehicle) {
        System.out.println("We are about to park your Vehicle of type" + vehicle.getVehicleType());
        if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if(freeLargeSpots>0) {
                parkYourLargeVehicle(vehicle);
            }else {
                System.out.println("Sorry all large spots are full");
            }
        }else if(vehicle.getVehicleType().equals(VehicleType.CAR) ){
            if(freeLargeSpots>0) {
                parkYourCompactVehicle(vehicle);
            }else {
                System.out.println("Sorry all compact spots are full");
            }
        }else if(vehicle.getVehicleType().equals(VehicleType.BIKE) ){
            if(freeLargeSpots>0) {
                parkYourBikeVehicle(vehicle);
            }else {
                System.out.println("Sorry all bike spots are full");
            }
        }
    }
    public void parkYourLargeVehicle(Vehicle vehicle) {
        LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
        largeSpot.setFree(false);
        largeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpot);
        largeSpotList.add(largeSpot);
        System.out.println("We have parked your " + vehicle.getVehicleType()+ " Vehicle.");
        freeLargeSpots--;
    }
    public void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
        compactSpot.setFree(false);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);
        compactSpotList.add(compactSpot);
        System.out.println("We have parked your " + vehicle.getVehicleType()+ " Vehicle.");
        freeCompactSpots--;
    }
    public void parkYourBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setFree(false);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);
        bikeSpotList.add(bikeSpot);
        System.out.println("We have parked your " + vehicle.getVehicleType()+ " Vehicle.");
        freeBikeSpots--;
    }
    public void unParkVehicle(Vehicle vehicle) {
        System.out.println("We are about to remove your Vehicle of type" + vehicle.getVehicleType());
        ParkingSpot parkingSpot = vehicle.getParkingSpot();

        if (vehicle.getVehicleType().equals(VehicleType.TRUCK)){
            if(largeSpotList.remove(vehicle.getParkingSpot())){
                freeLargeSpots++;
                parkingSpot.setFree(true);
            }else {
                System.out.println("We can't remove your car.");
            }
        } else if (vehicle.getVehicleType().equals(VehicleType.CAR) ){
            if(compactSpotList.remove(vehicle.getParkingSpot())){
                System.out.println("We have successfully removed your car.");
                freeCompactSpots++;
                parkingSpot.setFree(true);
            }else
                System.out.println("We can't remove your car.");
        } else if (vehicle.getVehicleType().equals(VehicleType.BIKE) ) {
            if (bikeSpotList.remove(vehicle.getParkingSpot())) {
                System.out.println("We have successfully removed your car.");
                freeBikeSpots++;
                parkingSpot.setFree(true);
            } else
                System.out.println("We can't remove your car.");
        }

    }

}
