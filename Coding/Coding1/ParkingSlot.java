import java.util.*;
import java.io.*;

public class ParkingSlot {
    public Map<Integer, boolean> slotNums;

    public ParkingSlot() {
        slotNums = new HashMap<>():
    }

    public boolean CheckSlotNum(int slotNum) {
        return slotNums.get(slotNum);
    }

    public void SetSlot(int slotNum) {
        slotNums.put(slotNum, true);
    }

    public boolean RemoveSlot(int slotNum) {
        slotNums.put(slotNum, false);
    }
}
