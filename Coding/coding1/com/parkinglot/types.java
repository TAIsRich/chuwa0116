package com.parkinglot;

enum vehicle_types {
    Car, Truck, Electric, Van, Motorcycle
}

enum parking_spot_types {
    Candicapped, Compact, Large, Handicapped, Motorcycle
}

enum AccountStatsu {
    ACTIVE, BLOCKED, BANNED, COMPROMISED, ARCHIVED, UNKNOWN
}

enum ParkingTicketStatus {
    ACTIVE, PAID, LOST
}

class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}

class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
}

public class types {

}
