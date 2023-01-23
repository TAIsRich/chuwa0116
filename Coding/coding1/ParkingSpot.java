public abstract class ParkingSpot {
    private String spot_num;
    private boolean empty;
    private Vehicle vehicle;
    private String type;
    public boolean is_empty(){
        return empty;
    }
    public ParkingSpot(String type) {
        this.type = type;
    }

    public void assign(Vehicle vehicle){
        this.vehicle = vehicle;
        this.empty = false;
    }

    public void remove(){
        this.vehicle = null;
        this.empty = true;
    }
}
