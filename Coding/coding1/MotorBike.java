public class MotorBike extends Vehicle {
    public MotorBike(){
        spotsNeeded = 1;
        size = VehicleSize.Motor;
    }
    
    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Motor || spot.getSize() == VehicleSize.Bus || spot.getSize() == VehicleSize.Car;
    }
}
