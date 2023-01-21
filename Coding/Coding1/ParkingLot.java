import java.util.*;
import java.io.*;

public class ParkingLot {
    private Map<ParkingSlot, Vehicle> parking;

    public ParkingLot() {
        parking = new HashMap<>();
    }

    public void FillSlot(ParkingSlot slot, Vehicle vehicle) {
        parking.put(slot, vehicle);
        slot.SetSlot();
    }

    public void RemoveSlot(ParkingSlot slot) {
        parking.remove(slot);
        slot.RemoveSlot();
    }
}
