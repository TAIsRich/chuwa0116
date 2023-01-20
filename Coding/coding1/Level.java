public class Level {
    int floor;
    ParkingSpot[] ownedSpots;
    int freeSpaces = 0;

    private final int SPOT_PER_ROW = 10;

    public int getAvailableSpots(){
        return freeSpaces;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if (getAvailableSpots()<vehicle.getSpotsNeeded()){
            return false;
        }
        int spotNumber = findAvailableSpots(vehicle);
        if (spotNumber<0){
            return false;
        }
        return parkAtSpot(spotNumber, vehicle);
    }

    private boolean parkAtSpot(int number, Vehicle vehicle){
        vehicle.clearSpots();
        boolean canPark = true;
        for (int i = num; i<num+vehicle.spotsNeeded; i++){
            canPark = canPark & ownedSpots[i].park(vehicle);
        }

        freeSpaces -= vehicle.spotsNeeded;
        return canPark;
    }


}