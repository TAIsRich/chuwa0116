public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 2;
        size = VehicleSize.Car;
    }
    public boolean canFitInSpot(parkingSpot spot){
        return spot.getSize() == VehicleSize.Car || spot.getSize() == VehicleSize.Bus;
    }
}