public class ParkingLot{
    private String slotId;
    private boolean parkingstatus;
    private Vehicle vehicle;

    public ParkingLot(String slotId, boolean parkingstatus, Vehicle vehicle) {
        this.slotId = slotId;
        this.parkingstatus = parkingstatus;
        this.vehicle = vehicle;
    }

}

public class Vehicle{
    private String type;
    private String plateNumber;

    public Vehicle(String type, String plateNumber) {
        this.type = type;
        this.plateNumber = plateNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}

class ParkingDetails {
    Vehicle vehicle;
    ParkingLot parkinglot;
    Date entryTime;
    Date exitTime;

    public ParkingDetails(Vehicle vehicle, Parking parking, Date entryTime, Date exitTime) {
        this.vehicle = vehicle;
        this.parking = parking;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingLot getParkinglot() {
        return parkinglot;
    }

    public void setParkinglot(ParkingLot parkinglot) {
        this.parkinglot = parkinglot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
}

