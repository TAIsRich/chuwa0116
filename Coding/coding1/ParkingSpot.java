public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private Level level;
    private int row;
    private int spotNumber;

    public ParkingSpot(Level level, int row, int spotNumber, VehicleSize spotSize){
        this.level = level;
        this.row = row;
        this.spotNumber = spotNumber;
        this.spotSize = spotSize;
    }

    public int getRow(){
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleSize getSize() {
        return spotSize;
    }

    public isEmpty(){
        return vehicle == null;
    }


}