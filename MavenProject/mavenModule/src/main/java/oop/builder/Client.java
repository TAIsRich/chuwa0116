package oop.builder;

public class Client {
    public static void main(String[] args) {
        Builder ofoBuilder = new OfOBuilder();
        Builder mobileBuilder = new MobileBuilder();

        Director ofoDirector = new Director(ofoBuilder);
        Director mobileDirector = new Director(mobileBuilder);

        Bike ofo = ofoDirector.installBike();
        Bike mobile = mobileDirector.installBike();

        System.out.println("OFO Frame: " + ofo.getFrame() + ", Seat: " + ofo.getSeat());
        System.out.println("Mobile Frame: " + mobile.getFrame() + ", Seat: " + mobile.getSeat());
    }
}
