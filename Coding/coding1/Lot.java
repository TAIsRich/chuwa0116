package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lot {
    private int capacity;
    private List<EachSpace> allSpaces = new ArrayList<>();

    public Lot(int capacity){
        this.capacity = capacity;
        for(int i = 0; i < capacity; ++i){
            EachSpace curSpace = new EachSpace(generateId(i), generateFarePerHour(i));
            allSpaces.add(curSpace);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int generateId(int index){
        return index;
    }

    public int generateFarePerHour(int index){
        return 10;
    }

    public boolean isFull(){
        for(int i = 0; i < capacity; ++i){
            if(!allSpaces.get(i).getStatus()){
                return false;
            }
        }
        return true;
    }

    public EachSpace park(Vehicle car){
        for(int i = 0; i < capacity; ++i){
            EachSpace cur = allSpaces.get(i);
            if(!cur.getStatus()){
                cur.parkInSpace(car);
            }
            return cur;
        }
        return null;
    }
}