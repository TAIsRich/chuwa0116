package org.example;

public class Vehicle {
    private String type;
    private String licensePlate;

    public Vehicle(String type, String licensePlate) {
        this.type = type;
        this.licensePlate = licensePlate;
    }

    public Vehicle() {

    }

    public String getType() {
        return type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

class Car extends Vehicle {

    public Car(String type, String licensePlate) {
        super(type, licensePlate);
    }
}

class Van extends  Vehicle {

    public Van(String type, String licensePlate) {
        super(type, licensePlate);
    }
}

class Truck extends  Vehicle {

    public Truck(String type, String licensePlate) {
        super(type, licensePlate);
    }
}
