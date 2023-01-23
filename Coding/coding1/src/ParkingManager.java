import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Map;

public class ParkingManager {
    private ParkingLot pk;
    public ParkingManager(ParkingLot pk){
        this.pk = pk;
    }
    public int ifAvailable(){
        return pk.getLimitations() - pk.getTotalVehicle();
    }

    public void displayAvailable(){
        int available = ifAvailable();
        if (available > 0){
            System.out.println("Parking space available: " + available);
        }else{
            System.out.println("Parking lot is full");
        }
    }

    public boolean park(Vehicle vehicle){
        if (ifAvailable() > 0){
            pk.getVehicles().put(vehicle.getLicense(), vehicle);
            pk.addVehicle();
            displayAvailable();;
            return true;
        }
        return false;
    }

    public void leave(String license){
        if(!pk.getVehicles().containsKey(license)){
            return;
        }
        pk.reduceVehicle();
        Iterator<Map.Entry<String, Vehicle>> iterator = pk.getVehicles().entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Vehicle> entry = iterator.next();
            if (license.equals(entry.getKey())) {
                iterator.remove();
            }
        }
        displayAvailable();
    }
}
