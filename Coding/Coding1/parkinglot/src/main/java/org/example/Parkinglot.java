package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parkinglot {
    // parking limit
    private final int smallLimit = 20;
    private final int mediumLimit = 10;
    private final int largeLimit = 3;

    // parking count
    private int smallCount;
    private int mediumCount;
    private int largeCount;

    // parking spots
    private List<ParkingSpot> carList;
    private List<ParkingSpot> vanList;
    private List<ParkingSpot> truckList;

    public Parkinglot() {
        smallCount = 0;
        mediumCount = 0;
        largeCount = 0;

        carList = new ArrayList<>(Collections.nCopies(smallLimit, new ParkingSpot("small")));

        vanList = new ArrayList<>(Collections.nCopies(mediumLimit, new ParkingSpot("medium")));

        truckList = new ArrayList<>(Collections.nCopies(largeLimit, new ParkingSpot("large")));
    }

    // check if any spot is left available
    private boolean isFull(Vehicle vehicle) {
        String type = vehicle.getType();
        if (type.equals("small")) {
            return smallCount >= smallLimit;
        } else if (type.equals("medium")) {
            return mediumCount >= mediumLimit;
        } else {
            return largeCount >= largeLimit;
        }
    }

    // park the vehicle
    public boolean parkVehicle(Vehicle vehicle) {
        if (!isFull(vehicle)) {
            String type = vehicle.getType();
            if (type.equals("small")) {
                ParkingSpot parkingSpot = carList.get(smallCount);
                parkingSpot.park(vehicle);
                carList.set(smallCount, parkingSpot);
                smallCount += 1;
            } else if (type.equals("medium")) {
                ParkingSpot parkingSpot = vanList.get(mediumCount);
                parkingSpot.park(vehicle);
                carList.set(mediumCount, parkingSpot);
                mediumCount += 1;
            } else {
                ParkingSpot parkingSpot = truckList.get(largeCount);
                parkingSpot.park(vehicle);
                carList.set(largeCount, parkingSpot);
                largeCount += 1;
            }
            return true;
        } else {
            return false;
        }
    }
}

