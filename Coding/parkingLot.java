import java.util.*;
class ParkingLot {
    private static class Vehicle {
        String color;
        String plate;
        String model;
        String type;
        Vehicle() {}
        Vehicle(String color, String model, String type, String plate){
            this.color = color;
            this.model = model;
            this.type = type;
            this.plate = plate;
        }
    }

    private int capacity; // width
    private int row;
    private int col;
    private Vehicle[][] lot;

    parking(){}

    parking(int row, int col) {
        this.row = row;
        this.col = col;
        lot = new Vehicle[row][col];
        this.capacity = this.row * this.col;
    }

    public boolean park(int x, int y, Vehicle v){
        if(!isPosAvailable(x, y)){
            System.out.println("Parking spot occupied");
            return false;
        }
        this.lot[y][x] = v;
        this.capacity--;
        return true;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean leave(int x, int y){
        if(isPosAvailable(x, y)){
            System.out.println("Parking spot is empty!");
            return false;
        }
        this.lot[y][x] = null;
        this.capacity++;
        return true;
    }

    public boolean isPosAvailable(int x,int y){
        return this.lot[y][x] == null;
    }

    public void disPlayPrakingLot(){
        for(int i = 0; i < this.col; i++){
            for(int j = 0; j < this.row; j++){
                System.out.print(this.lot[i][j].plate);
                System.put.print(" ");
            }
            System.out.println();
        }
    }
}