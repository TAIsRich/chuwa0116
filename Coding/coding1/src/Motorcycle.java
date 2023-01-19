public class Motorcycle extends Vehicle{
    public Motorcycle(String licensePlate, String Company){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
        this.licensePlate = licensePlate;
        this.Company = Company;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        //checks motocycle can park in anywhere

        return spot.getSize() == VehicleSize.CarSize || spot.getSize() == VehicleSize.Motorcycle;

    }
}
