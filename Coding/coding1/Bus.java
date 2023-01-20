public class Bus extends Vehicle {
    public Bus(String license){
        spotsNeeded = 4;
        size = VehicleSize.Bus;
        licenseNumber = license;
    }

    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Bus;
    }   
}
