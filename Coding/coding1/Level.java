package coding1;

/**
 * @author Zhipeng Yin
 * @date 2023-01-20 09:35
 */

//represent a level in a parking garage
public class Level {
    private int floor;
    private ParkingSpot[] spots;	//number of spots in each level, including large, compact and motorcycle size
    private int availableSpots = 0;	//number of free spots
    private static final int SPOT_PER_ROW = 10;

    public Level(int flr, int numberSpots){
        floor = flr;
        availableSpots = numberSpots;
        spots = new ParkingSpot[numberSpots];

        int largeSpots = numberSpots / 4;
        int bikeSpots = numberSpots / 4;
        int compactSpots = numberSpots - largeSpots - bikeSpots;

        for (int i = 0; i < numberSpots; i++){
            VehicleSize sz = VehicleSize.Motorcycle;
            if (i < largeSpots){
                sz = VehicleSize.Large;
            }
            else if (i < largeSpots + compactSpots){
                sz = VehicleSize.Compact;
            }
            int row = i / SPOT_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, sz);
        }
    }

    public int availableSpots(){
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle){
        //find a place to park this vehicle, return false if failed
        if (availableSpots() < vehicle.getSpotsNeeded())
            return false;

        int spotNumber = findAvailableSpots(vehicle);
        if (spotNumber < 0)
            return false;
        return parkStartingAtSpot(spotNumber, vehicle);
    }

    private boolean parkStartingAtSpot(int num, Vehicle v){
        //park a vehicle starting at the spot spotNumber, and continuing until vehicle.spotsNeeded
        v.clearSpots();
        boolean success = true;
        for (int i = num; i < num + v.spotsNeeded; i++){
            success &= spots[i].park(v);
        }
        availableSpots -= v.spotsNeeded;
        return success;
    }

    private int findAvailableSpots(Vehicle vehicle){
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;

        for (int i = 0; i < spots.length; i++){
            ParkingSpot spot = spots[i];
            if (lastRow != spots[i].getRow()){
                spotsFound = 0;
                lastRow = spots[i].getRow();
            }
            if (spots[i].canFitVehicle(vehicle)){
                spotsFound++;
            }
            else{
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded){
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }

    public void spotFreed(){
        availableSpots++;
    }
}
