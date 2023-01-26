import java.util.List;

public class Row {

    private int availableSpots;
    private List<Spot> spots;

    public int getAvailableCount(){
        availableSpots = 0;
        for (Spot s: spots){
            if (s.isAvailable()){
                availableSpots ++;
            }
        }
        return availableSpots;
    }

    public List<Spot> getSpots() {
        return spots;
    }
}
