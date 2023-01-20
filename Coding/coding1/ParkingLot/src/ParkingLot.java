public class ParkingLot {
    private Level[] levels;
    private int levelNums;
    private int totalSlots;

    public ParkingLot(int levelNums, int totalSlots) {
        this.levelNums = levelNums;
        this.totalSlots = totalSlots;
        int slotPerLevel = totalSlots / levelNums;
        levels = new Level[levelNums];

        for(int i = 0; i < levelNums; i++){
            levels[i] = new Level(i, slotPerLevel);
        }
    }

    public int getLevelNums() {
        return levelNums;
    }

    public void setLevelNums(int levelNums) {
        this.levelNums = levelNums;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
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
