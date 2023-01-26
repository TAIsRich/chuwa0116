package designPattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder bd){
        builder = bd;
    }
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
