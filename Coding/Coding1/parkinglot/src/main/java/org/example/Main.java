package org.example;

public class Main {
    public static void main(String[] args) {
        Parkinglot parkinglot = new Parkinglot();

        parkinglot.parkVehicle(new Car("small","a"));
        parkinglot.parkVehicle(new Car("small","b"));
        parkinglot.parkVehicle(new Car("small","c"));
        parkinglot.parkVehicle(new Car("small","d"));
        parkinglot.parkVehicle(new Car("small","e"));

        parkinglot.parkVehicle(new Van("medium","f"));
        parkinglot.parkVehicle(new Van("medium","g"));
        parkinglot.parkVehicle(new Van("medium","h"));

        parkinglot.parkVehicle(new Truck("large","i"));
        parkinglot.parkVehicle(new Truck("large","j"));
        parkinglot.parkVehicle(new Truck("large","k"));

        // try to park one more truck
        if (!parkinglot.parkVehicle(new Truck("large","l"))) {
            System.out.println("Cannot park more trucks");
        }

    }

}