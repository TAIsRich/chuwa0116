package org.example.builder;

/**
 * 生产自行车是一个复杂的过程，它包含了车架，车座等组件的生产。而车架又有碳纤维，铝合金等材质的，车座有橡胶，真皮等材质。对于自行车的生产就可以使用建造者模式。
 *
 * 这里Bike是产品，包含车架，车座等组件；Builder是抽象建造者，MobikeBuilder和OfoBuilder是具体的建造者；Director是指挥者。
 * */

public class Client {
    public static void main(String[] args) {
            showBike(new OfoBuilder());
            showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
            Director director = new Director(builder);
            Bike bike = director.construct();
            System.out.println(bike.getFrame());
            System.out.println(bike.getSeat());
    }
}

