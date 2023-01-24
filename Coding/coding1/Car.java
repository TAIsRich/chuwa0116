public class Car extends Vehicle{
    public Car(String license){
        spotsNeeded = 2;
        size = VehicleSize.Car;
        licenseNumber = license;
    }
    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Car || spot.getSize() == VehicleSize.Bus;
    }
}