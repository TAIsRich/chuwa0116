package coding1;

public  abstract class Vehicle {
    private VehicleType vehicleType;
    private String licence;


    public Vehicle(VehicleType vehicleType, String licence) {
        this.vehicleType = vehicleType;
        this.licence = licence;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }


    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
