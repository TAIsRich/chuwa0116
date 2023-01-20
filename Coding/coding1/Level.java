public class Level {
    int floor;
    ParkingSpot[] ownedSpots;
    int freeSpaces = 0;

    private final int SPOT_PER_ROW = 10;

    public Level(int floor, int numberSpots){
        this.floor = floor;
        this.freeSpaces = numberSpots;
        this.ownedSpots = new ParkingSpot[numberSpots];

        int largeSpots = numberSpots/4;
        int smallSpots = numberSpots/4;

        int midSpots = numberSpots - largeSpots - smallSpots;

        for (int i = 0; i<numberSpots; i++){
            VehicleSize s = VehicleSize.Motor;
            if (i<largeSpots){
                s = VehicleSize.Bus;
            } else if (i<largeSpots+midSpots){
                s = VehicleSize.Car;
            }

            ownedSpots[i] = new ParkingSpot(this, i/SPOT_PER_ROW, i, s);
        }
    }

    public int getAvailableSpots(){
        return freeSpaces;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if (getAvailableSpots()<vehicle.getSpotsNeeded()){
            return false;
        }
        int spotNumber = findAvailableSpots(vehicle);
        if (spotNumber<0){
            return false;
        }
        return parkAtSpot(spotNumber, vehicle);
    }


    private boolean parkAtSpot(int number, Vehicle vehicle){
        vehicle.clearSpots();
        boolean canPark = true;
        for (int i = number; i<number+vehicle.spotsNeeded; i++){
            canPark = canPark & ownedSpots[i].park(vehicle);
        }

        freeSpaces -= vehicle.spotsNeeded;
        return canPark;
    }

    public void spotFreed(){
        freeSpaces += 1;
    }

    private int findAvailableSpots(Vehicle vehicle){
        int spotsNeeded = vehicle.getSpotsNeeded();
		int lastRow = -1;
		int spotsFound = 0;

		for (int i = 0; i < ownedSpots.length; i++){
			ParkingSpot spotd = ownedSpots[i];
			if (lastRow != spotd.getRow()){
				spotsFound = 0;
				lastRow = spotd.getRow();
			}
			if (spotd.canFitVehicle(vehicle)){
				spotsFound++;
			} else{
				spotsFound = 0;
			}
			if (spotsFound == spotsNeeded){
				return i - (spotsNeeded - 1);
			}
		}

        return -1;
    }


}