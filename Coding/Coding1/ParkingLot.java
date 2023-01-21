import java.util.*;
import java.io.*;

public class ParkingLot {
    private Map<Integer, Vehicle> parking;

    public ParkingLot() {
        parking = new HashMap<>();
    }

    public void FillSlot(ParkingSlot slot, Vehicle vehicle) {
        int slotNum = 0;
        for (int s : slot.keySet()) {
            if (!slot.get(s)) {
                slot.SetSlot(s);
                slotNum = s;
                break;
            }
        }
        parking.put(slotNum, vehicle);
    }

    public void RemoveSlot(ParkingSlot slot, int slotNum) {
        parking.remove(slotNum);
        slot.RemoveSlot(slotNum);
    }
}
