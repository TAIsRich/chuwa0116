package coding1;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int levels;
    private int compactSpotsEachLevel;
    private int smallSpotsEachLevel;
    private int largeSpotsEachLevel;

    private List<Level> parkingLevels;

    public ParkingLot(int levels, int compactSpotsEachLevel, int smallSpotsEachLevel, int largeSpotsEachLevel) {
        this.levels = levels;
        this.compactSpotsEachLevel = compactSpotsEachLevel;
        this.smallSpotsEachLevel = smallSpotsEachLevel;
        this.largeSpotsEachLevel = largeSpotsEachLevel;

        parkingLevels = new ArrayList<>();
        for(int i = 0; i < levels; ++i){
            parkingLevels.add(new Level(i, largeSpotsEachLevel, compactSpotsEachLevel, smallSpotsEachLevel));
        }
    }


    public void getParkingPosition(Vehicle vehicle){
        boolean availablePosition = false;
        for(int i = 0; i < parkingLevels.size(); ++i){
            Level level = parkingLevels.get(i);
            if(level.canPark(vehicle)){
                int id = level.parkCar(vehicle);
                System.out.println("You can park vehicle " + vehicle.getLicence() + " in " + i + " level, " + vehicle.getVehicleType()+" area, " + id  +" positions.");
                return;
            }
        }
        if(!availablePosition){
            System.out.println("Sorry there isn't available position for car type. ");
        }
    }

    public void freeParkingPosition(int level, int id, Vehicle vehicle){
        if(parkingLevels.get(level).freeSpot(id, vehicle))
        {
            System.out.println("You can free the position in "+ level + " level, " + vehicle.getVehicleType()+" area, " + id +" positions.");
        }
        else{
            System.out.println("The car is not in the parking pot. You can't free the position.");
        }
    }
}

