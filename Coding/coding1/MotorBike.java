public class MotorBike extends Vehicle {
    public MotorBike(String license){
        spotsNeeded = 1;
        size = VehicleSize.Motor;
        licenseNumber = license;
    }
    
    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Motor || spot.getSize() == VehicleSize.Bus || spot.getSize() == VehicleSize.Car;
    }
}
