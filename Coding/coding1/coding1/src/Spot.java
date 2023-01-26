public class Spot {

    private boolean available;

    public Spot(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void takeSpot(){
        available = false;
    }

    public void leaveSpot(){
        available = true;
    }

}
