
public class Car implements Vehicle {
    private String licensePlate;
    private int size;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.size = 1;
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