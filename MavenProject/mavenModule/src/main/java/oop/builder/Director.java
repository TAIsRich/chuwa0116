package oop.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike installBike() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
