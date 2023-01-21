import java.util.List;

public class Level {
    private List<Spot> spots;
    private int spotCnt;
    private int floorId;

    public Level(int floorId, int fullCapacity){
        this.spotCnt = fullCapacity;
        this.floorId = floorId;
        for (int i = 0; i < this.spotCnt; ++i){
            spots.add(new Spot(i));
        }
    }

    public Spot findSpot(){
        for (int i = 0; i < this.spots.size(); i++){
            if (spots.get(i).getAvailability() == true){
                return spots.get(i);
            }
        }

        return null;
    }

    public int getAvailableCnt() {
        return spotCnt;
    }

    public void updateSpotCnt(int diff){
        spotCnt += diff;
    }



}
