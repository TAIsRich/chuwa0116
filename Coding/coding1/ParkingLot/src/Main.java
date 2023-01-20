public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("aaaaaa");
        Car c2 = new Car("bbbbbb");
        ParkingLot pl = new ParkingLot(2, 20);

        pl.park(0, 0, c1);
        pl.park(0, 0, c2);
        pl.free(0, 0);
        pl.park(0, 0, c2);

    }
}