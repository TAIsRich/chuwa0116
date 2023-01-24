import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkedSpots = new ArrayList<ParkingSpot>();
    protected String licenseNumber;

    protected int spotsNeeded;

    protected VehicleSize size;

    public int getSpotsNeeded(){
        return spotsNeeded;
    }
    public VehicleSize getSize(){
        return size;
    }

    public void addSpots(ParkingSpot spot){
        parkedSpots.add(spot);
    }

    public void clearSpots(){
        for (int i = 0; i<parkedSpots.size(); i++){
            parkedSpots.get(i).removeVehicle();
        }
        
        parkedSpots.clear();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);




}