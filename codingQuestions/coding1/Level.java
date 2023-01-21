package coding1;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private List<CompactSpot>  compactSpots;
    private List<LargeSpot> largeSpots;
    private List<SmallSpot> smallSpots;

    private int freeCompactSpots;
    private int freeLargeSpots;
    private int freeSmallSpot;


    private int id;

    Level(int id, int freeLargeSpots, int freeCompactSpots, int freeSmallSpot){
        this.id = id;
        this.freeLargeSpots = freeLargeSpots;
        this.freeSmallSpot = freeSmallSpot;
        this.freeCompactSpots = freeCompactSpots;

        compactSpots = new ArrayList<>();
        smallSpots = new ArrayList<>();
        largeSpots = new ArrayList<>();

        for(int i = 0; i < freeLargeSpots; ++ i){
            largeSpots.add(new LargeSpot(i));
        }

        for(int i = 0; i < freeSmallSpot; ++ i){
            smallSpots.add(new SmallSpot(i));
        }

        for(int i = 0; i < freeCompactSpots; ++ i){
            compactSpots.add(new CompactSpot(i));
        }

    }

    public boolean freeSpot(int id, Vehicle vehicle){
        switch (vehicle.getVehicleType()){
            case CAR:
                if(compactSpots.get(id).getVehicle() == vehicle){
                    freeCompactSpots++;
                    compactSpots.get(id).unpark();
                    return true;
                }
                break;
            case BUS:
                if(largeSpots.get(id).getVehicle() == vehicle){
                    freeLargeSpots++;
                    largeSpots.get(id).unpark();
                    return true;
                }
                break;
            case MOTORCYCLE:
                if(smallSpots.get(id).getVehicle() == vehicle){
                    freeSmallSpot++;
                    smallSpots.get(id).unpark();
                    return true;
                }
                break;
        }
        return false;
    }

    public boolean canPark(Vehicle vehicle){
        boolean flag = false;
        switch (vehicle.getVehicleType()){
            case BUS:
                if(freeLargeSpots > 0){
                    flag = true;
                }
                break;
            case CAR:
                if(freeCompactSpots > 0){
                    flag = true;
                }
                break;
            case MOTORCYCLE:
                if(freeSmallSpot > 0){
                    flag = true;
                }
                break;
        }
        return flag;
    }




    public int parkCar(Vehicle vehicle){
        switch (vehicle.getVehicleType()){
            case BUS:
                if(freeLargeSpots > 0){
                    for(int i = 0; i < largeSpots.size(); ++i){
                        if(largeSpots.isEmpty()){
                            freeLargeSpots --;
                            return i;
                        }
                    }
                }
                break;
            case CAR:
                if(freeCompactSpots > 0){
                    for(int i = 0; i < compactSpots.size(); ++i){
                        if(compactSpots.get(i).isEmpty()){
                            freeCompactSpots --;
                            return i;
                        }
                    }
                }
                break;
            case MOTORCYCLE:
                if(freeSmallSpot > 0){
                    for(int i = 0; i < largeSpots.size(); ++i){
                        if(largeSpots.isEmpty()){
                            freeLargeSpots --;
                            return i;
                        }
                    }
                }
                break;
        }
        return -1;
    }

}
