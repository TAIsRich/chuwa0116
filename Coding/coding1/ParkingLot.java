package coding1;

/**
 * @author Zhipeng Yin
 * @date 2023-01-20 09:44
 */
//a wrapper class for class of Levels
public class ParkingLot {
    private Level[] levels;
    private final int NUM_LEVELS = 5;

    public ParkingLot(){
        levels = new Level[NUM_LEVELS];
        for (int i = 0; i < NUM_LEVELS; i++){
            levels[i] = new Level(i, 30);
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for (int i = 0; i < levels.length; i++){
            if (levels[i].parkVehicle(vehicle))
                return true;
        }
        return false;
    }
}
