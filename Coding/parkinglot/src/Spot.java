public class Spot {
    private boolean availability;

    private Level level;
    private int spotId;

    public Spot(int id){
        this.spotId = id;
        this.availability = true;
    }

    public boolean getAvailability(){
        return this.availability;
    }

    public void levaeSpot(){
        this.availability = true;
        level.updateSpotCnt(1);
    }

    public void enterSpot(){
        this.availability = false;
        level.updateSpotCnt(-1);
    }
}
