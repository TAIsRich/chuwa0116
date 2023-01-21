package com.chuwa;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
	private ParkingSlot[][][] slots;
	private Map<Vehicle,ParkingSlot> map = new HashMap<>();
	private int level,row,col;
	public ParkingSystem(int level, int row, int col){
		this.level = level;
		this.row = row;
		this.col = col;
		slots = new ParkingSlot[level][row][col];
		//The remaining code in this constructor should be responsible for
		//initialize all the parking slots inside this parking lot
	}
	public int getRemainingSlots(){
		return level*row*col - map.size();
	}
	public boolean parkVehicle(Vehicle vehicle){
		if(getRemainingSlots() == 0)return false;
		for(int i=0;i<level;++i)
			for(int j=0;j<row;++j)
				for(int k=0;k<col;++k)
					//Only if the given parking slot's size is greater than our vehicle's size will we are able to park
					//our vehicle
					if(!slots[i][j][k].isOccupied() && slots[i][j][k].getParkingLotSize()>=vehicle.getVehicleSize()){
						slots[i][j][k].setOccupied(true);
						map.put(vehicle,slots[i][j][k]);
						return true;
					}
		return false;
	}
	public boolean unparkVehicle(Vehicle vehicle){
		if(!map.containsKey(vehicle)) return false;
		ParkingSlot slot = map.get(vehicle);
		slot.setOccupied(false);
		map.remove(vehicle);
		return true;
	}
}
