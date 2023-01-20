public class Bus extends Vehicle {
    public Bus(){
        spotsNeeded = 4;
        size = VehicleSize.Bus;
    }

    public boolean canFitInSpot(parkingSpot spot){
        return spot.getSize() == VehicleSize.Bus;
    }   
}
