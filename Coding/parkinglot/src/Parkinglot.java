import java.sql.Timestamp;
import java.util.List;

public class Parkinglot {
    private List<Level> levels;
    private int levelCapacity;
    private int floorCnt;
    private int hourRate;


    public Parkinglot(int levelCapacity, int floorCnt, int hourRate) {
        this.levelCapacity = levelCapacity;
        this.floorCnt = floorCnt;
        this.hourRate = hourRate;

        for(int i = 0; i < floorCnt; ++i){
            this.levels.add(new Level(i, this.floorCnt));
        }
    }

    public Spot findSpot(Vehicle v){
        for (int i = 0; i < this.floorCnt; i++){
            if (levels.get(i).getAvailableCnt() > 0){
                Level available_level = levels.get(i);
                Spot availableSpot = available_level.findSpot();
                return availableSpot;
            }
        }
        return null;
    }

    public Ticket checkinVehicle(Vehicle v){
        Spot spot = findSpot(v);
        if (spot != null){
            Timestamp currTime = new Timestamp(System.currentTimeMillis());
            occupySpot(spot);
            return new Ticket(v, spot, currTime);
        }
        else{
            System.out.println("All spots are occupied");
            return null;
        }
    }

    public int checkoutVehicle(Ticket ticket){
        Timestamp currTime = new Timestamp(System.currentTimeMillis());
        emptySpot(ticket.getMySpot());
        int cost = getCost(ticket, currTime);
        return cost
    }

    public int getCost(Ticket ticket, Timestamp currTime){
        return hourRate * (currTime - ticket.getStartTime());
    }
    public void occupySpot(Spot spot){
        spot.enterSpot();
    }

    public void emptySpot(Spot spot){
        spot.levaeSpot();
    }

}
