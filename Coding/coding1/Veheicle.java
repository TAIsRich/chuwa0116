package Coding.coding1;

import java.util.*;

enum VehicleSize { Motorcycle, Compact,Large }

public abstract class Veheicle {


    protected String licensePlate;
    protected VehicleSize vSize;
    protected int spotsNeeded;

    protected int[] parkingLoc;

    public Veheicle(String plate){
        this.licensePlate = plate;
        parkingLoc = new int[3];
        Arrays.fill(parkingLoc, -1);
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public int getvSize() {
        return switch (vSize) {
            case Motorcycle -> 1;
            case Compact -> 3;
            case Large -> 5;
        };
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setLoc(int lvl, int r, int c){
        parkingLoc[0]=lvl;
        parkingLoc[1]=r;
        parkingLoc[2]=c;
    }
    public int[] getLoc(){
        return parkingLoc;
    }
}

class Motorcycle extends Veheicle{

    public Motorcycle(String plate){
        super(plate);
        this.vSize = VehicleSize.Motorcycle;
    }
}

class Seden extends Veheicle{

    public Seden(String plate){
        super(plate);
        this.vSize = VehicleSize.Compact;
    }
}

class Bus extends Veheicle{

    public Bus(String plate){
        super(plate);
        this.vSize = VehicleSize.Large;
    }
}









