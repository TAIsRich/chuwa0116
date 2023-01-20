public class Level{
    private List<ParkingSpot> spotList;
    private int availableCount;
    private boolean available;

    public Level(){
        this.availableCount = NUM_SPOTS;
    }

    public boolean isAvailable(){
        return available;
    }
    public int getAvailableCount(){
        return  availableCount;
    }
    public void updateAvailableCount(){

    }
}