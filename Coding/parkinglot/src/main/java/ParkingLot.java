public class ParkingLot {
    private final Level[] levels;

    public ParkingLot(int levelNums, int totalSlots) {
        int slotPerLevel = totalSlots / levelNums;
        levels = new Level[levelNums];

        for(int i = 0; i < levelNums; i++){
            levels[i] = new Level(i, slotPerLevel);
        }
    }

    public void park(int level, int slot, Car c){
        boolean f = levels[level].park(slot, c);
        if(f){
            System.out.println("Car " + c.getLiscense() + " parked on level " + (level) + " slot " + slot);
        }
    }

    public void free(int level, int slot){
        boolean f = levels[level].free(slot);
        if(f){
            System.out.println("Free slot " + slot + " on level " + level);
        }else{
            System.out.println("Failed!");
        }
    }
}
