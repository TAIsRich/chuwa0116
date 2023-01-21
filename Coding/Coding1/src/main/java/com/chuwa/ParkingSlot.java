package com.chuwa;

public class ParkingSlot {
	private int level,row,col;
	private int parkingLotSize;
    private boolean occupied;

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getParkingLotSize() {
		return parkingLotSize;
	}

	public void setParkingLotSize(int parkingLotSize) {
		this.parkingLotSize = parkingLotSize;
	}
}
