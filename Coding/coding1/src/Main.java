public class Main {
    public static void main(String[] args) {


        ParkingLot P1 = new ParkingLot(2);

        Car c1 = new Car("1234","Chuwa");
        Motorcycle c2 = new Motorcycle("4556","Chuwa");
        Car c3 = new Car("1680","Chuwa");
        Motorcycle c4 = new Motorcycle("0789","Chuwa");
        Car c5 = new Car("1789","Chuwa");
        P1.parkVehicle(c1);
        P1.parkVehicle(c2);
        P1.parkVehicle(c3);
        P1.ComapnyParked("Chuwa");
        P1.ComapnyParked("Chuwa");
        P1.leave(c2,0);
        //Note that c2 is from Microsoft
        P1.ComapnyParked("Chuwa");
        P1.parkVehicle(c4);
        P1.parkVehicle(c5);


    }
}
