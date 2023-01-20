package Coding.coding1;

import java.util.*;

public class ParkingSpot {

    int lvl;
    int row;
    int rowSize; //[0-rowSize-1] parking spot per row
    int[][][] parkingBitmap;


    public ParkingSpot(int numLvl, int numRow, int numSpace){
        parkingBitmap = new int[numLvl][numRow][numSpace];
        lvl = numLvl;
        row = numRow;
        rowSize = numSpace;
    }

    public boolean parkCar(Veheicle c){
        int vSize = c.getvSize();
        int[] spot = new int[3];
        boolean flag = true;

        for (int i=0;i<lvl;i++){
            spot[0] = i;
            for (int j=0;j<row;j++){
                spot[1] = j;
                for (int k=0;k<rowSize-vSize;k++){
                    spot[2] = k;
                    for (int l=0;l<vSize;l++){
                        if (parkingBitmap[i][j][k+l] == 1){
                            flag = false;
                            break;
                        }
                    }
                }
            }
        }
        if (flag){
            for (int i=0;i<vSize;i++){
                parkingBitmap[spot[0]][spot[1]][spot[2]+i] = 1;
                c.setLoc(spot[0], spot[1], spot[2]);
            }
        }
        return flag;
    }

    // return if successfully remove a car
    public boolean removeCar(Veheicle c){
        int[] spot = c.getLoc();
        if (spot[0] == -1) return false;
        int vSize = c.getvSize();
        for (int i=0;i<vSize;i++){
            parkingBitmap[spot[0]][spot[1]][spot[2]+i] = 0;
            c.setLoc(-1,-1,-1);
        }

        return true;
    }
}
