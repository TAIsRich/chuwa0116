/**
 * enum VehicleSize {
 *   Compact(1)
 *   Large(2)
 *   public int getSize()
 * }
 *
 * public abstract class Vehicle {
 *   public abstract VehicleSize getSize();
 * }
 * class Car extends Vehicle {
 *   @Override
 *   public VehicleSize getSize() {
 *     return VehicleSize.Compact;
 *   }
 * }
 *
 * class Truck extends Vehicle {
 *   @Override
 *   public VehicleSize getSize() {
 *     return VehicleSize.Large;
 *   }
 * }
 */

public class ParkingSpot {
  private final VehicleSize size;
  private Vehicle currentVehicle;
  
  public ParkingSpot(VehicleSize size) {
    this.size = size;
  }
  public VehicleSize getSize(){
    return this.size;
  }
  public void park(Vehicle v) {
    if(this.currentVehicle == null && this.size.getSize() >= v.getSize().getSize()){
      this.currentVehicle = v;
    }
  }

  public void leave() {
    this.currentVehicle = null;
  }

  public Vehicle getVehicle() {
    return this.currentVehicle;
  }

}
public class Level {
  private List<ParkingSpot> spot;
  public Level(int numOfSpots) {
    spot = new ArrayList<>(numOfSpots);
    int i = 0;
    for(; i < numOfSpots/2; i ++){
      spot.add(new ParkingSpot(VehicleSize.Compact));
    }
    for(; i < numOfSpots; i ++){
      spot.add(new ParkingSpot(VehicleSize.Large));
    }
  }

  public boolean hasSpot(Vehicle v) {
    for(ParkingSpot s: spot){
      if(s.getVehicle() == null && s.getSize().getSize() >= v.getSize().getSize()){
        return true;
      }
    }
    return false;
  }

  public boolean park(Vehicle v) {
    for(ParkingSpot s: spot){
      if(s.getVehicle() == null && s.getSize().getSize() >= v.getSize().getSize()){
        s.park(v);
        return true;
      }
    }
    return false;

  }

  public boolean leave(Vehicle v) {
    for(ParkingSpot s: spot){
      if(s.getVehicle() == v){
        s.leave();
        return true;
      }
    }
    return false;
  }
}
public class ParkingLot {
  private final Level[] levels;
  public ParkingLot(int numLevels, int numSpotsPerLevel) {
    levels = new Level[numLevels];
    for(int i = 0; i < numLevels; i ++){
      levels[i] = new Level(numSpotsPerLevel);
    }
  }

  public boolean hasSpot(Vehicle v) {
    for(Level l: levels){
      if(l.hasSpot(v)){
        return true;
      }
    }
    return false;
  }

  public boolean park(Vehicle v) {
    for(Level l: levels){
      if(l.park(v)){
        return true;
      }
    }
    return false;
  }

  public boolean leave(Vehicle v) {
    for(Level l: levels){
      if(l.leave(v)){
        return true;
      }
    }
    return false;
  }
}
