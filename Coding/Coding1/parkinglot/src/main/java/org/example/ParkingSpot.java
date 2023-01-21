package org.example;

public class ParkingSpot {
    private boolean taken;
    private String type;
    private Vehicle vehicle;

    public ParkingSpot(String type) {
        this.type = type;
        taken = false;
        vehicle = new Vehicle();
    }

    public String getType() {
        return type;
    }

    public void park(Vehicle vehicle)  {
        this.vehicle = vehicle;
        taken = true;
    }

    public void leave() {
        this.vehicle = new Vehicle();
        taken = false;
    }
}
