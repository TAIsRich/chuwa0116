import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLot pk = new ParkingLot(200);
        ParkingManager pm = new ParkingManager(pk);
        pm.displayAvailable();
        boolean systemOn = true;
        while(systemOn){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("end")){
                systemOn = false;
            }else if (input.startsWith("park")){
                String[] description = input.split(" ");
                Vehicle vehicle = new Vehicle(description[1], description[2], description[3]);
                pm.park(vehicle);
            }else if (input.startsWith("leave")){
                String[] description = input.split(" ");
                pm.leave(description[1]);
            }
        }
    }
}