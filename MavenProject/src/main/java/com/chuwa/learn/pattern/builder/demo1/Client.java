package com.chuwa.learn.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        //创建指挥对象
        Director director = new Director(new MobileBuilder());
        //让指挥者开始装配
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
