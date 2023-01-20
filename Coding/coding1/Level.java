package Coding.coding1;

import java.util.ArrayList;
import java.util.List;

public class Level {
    public int levelNumber;
    public int rows;
    public List<ParkingSlot> takenSlots;
    public int SLOTS_PER_ROW = 2;

    public Level(int row, int levelNumber) {
        this.levelNumber = levelNumber;
        this.rows = rows;
        this.takenSlots = new ArrayList<>();
    }

    public ParkingSlot findAvailableSpot() {
        int totalNumberSlots = rows * SLOTS_PER_ROW;
        if (takenSlots.size() >= totalNumberSlots){
            return null;
        } else if (takenSlots.isEmpty()) {
            return new ParkingSlot(0, 0, levelNumber);
        } else {
            ParkingSlot lastSpaceOccupied = takenSlots.get(takenSlots.size() -  1);
            if (lastSpaceOccupied.col < SLOTS_PER_ROW) {
                return new ParkingSlot(lastSpaceOccupied.row, lastSpaceOccupied.col + 1, levelNumber);
            } else {
                return new ParkingSlot(lastSpaceOccupied.row + 1, 0, levelNumber);
            }
        }
    }

    public boolean park(Car car) {
        ParkingSlot freeSpace = findAvailableSpot();
        if (freeSpace == null) {
            return false;
        } else {
            //park in free space
            freeSpace.park(car);
            takenSlots.add(freeSpace);
            return true;
        }
    }
}
