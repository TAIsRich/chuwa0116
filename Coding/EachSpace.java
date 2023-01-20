package com.company;

public class EachSpace {
    private int id;
    private boolean isOccupied = false;
    private Vehicle occupiedVehicle = null;
    private double farePerHour;

    public EachSpace(int id, int farePerHour){
        this.id = id;
        this.farePerHour = farePerHour;
    }

    public void parkInSpace(Vehicle car){
        occupiedVehicle = car;
        isOccupied = true;
    }

    public void leaveSpace(){
        occupiedVehicle = null;
        isOccupied = false;
    }

    public boolean getStatus(){
        return isOccupied;
    }

    public Vehicle getOccupiedVehicle(){
        return occupiedVehicle;
    }

    public int getId() {
        return id;
    }
    public double getFare(double hour){
        return hour * farePerHour;
    }

    public double getFarePerHour() {
        return farePerHour;
    }

    public void setFarePerHour(double farePerHour) {
        this.farePerHour = farePerHour;
    }
}
