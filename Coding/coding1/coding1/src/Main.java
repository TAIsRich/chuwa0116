public class Main {
    public static void main(String[] args) {


        Spot spot1 = new Spot(true);
        Spot spot2 = new Spot(true);


        // get number of available spots
        int availableSpots = ParkingLot.getAvailableCount();
        System.out.println("There are " + availableSpots + " spots available.");

        // park vehicle
        Vehicle myVehicle = new Vehicle();
        Ticket ticket = ParkingLot.parkVehicle(myVehicle);
        System.out.println("There are " + availableSpots + " spots available.");
        System.out.println("You parked at" + ticket.getSpots());
        System.out.println("You parked since" + ticket.getStartTime());

        // clear spot
        parkingLot.clearSpot(ticket);
    }
}