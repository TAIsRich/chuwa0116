interface Vehicle {
    String getPlateNumber();
}

class Car implements Vehicle {
    private String plateNumber;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}

class Bike implements Vehicle {
    private String plateNumber;

    public Bike(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}

class ParkingLot {
    private int capacity;
    private Map<String, Vehicle> parkedVehicles;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedVehicles = new HashMap<>();
    }

    public boolean park(Vehicle vehicle) {
        if (parkedVehicles.size() >= capacity) {
            return false;
        }
        parkedVehicles.put(vehicle.getPlateNumber(), vehicle);
        return true;
    }

    public boolean release(String plateNumber) {
        if (!parkedVehicles.containsKey(plateNumber)) {
            return false;
        }
        parkedVehicles.remove(plateNumber);
        return true;
    }
}
