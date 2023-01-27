package com.company;

public class Main {

    public static void main(String[] args) {
        Lot lot1 = new Lot(100);
        Vehicle car1 = new Vehicle("12345", "Sedan");
        if(!lot1.isFull()){
            EachSpace space1 = lot1.park(car1);
            double fee = space1.getFare(0.5);
        }
    }
}
