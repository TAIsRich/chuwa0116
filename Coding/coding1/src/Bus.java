
public class Bus implements Vehicle {
    private String licensePlate;
    private int size;

    public Bus(String licensePlate) {
        this.licensePlate = licensePlate;
        this.size = 5;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public int getSize() {
        return size;
    }
}