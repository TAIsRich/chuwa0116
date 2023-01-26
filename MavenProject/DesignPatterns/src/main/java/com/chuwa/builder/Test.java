package com.chuwa.builder;

public class Test {
	public static void main(String[] args) {
		Bike.BikeBuilder bikeBuilder = new Bike.BikeBuilder();
	    bikeBuilder.setBrand("ofo").setBrand("red");
		Bike bike = bikeBuilder.build();
	}
}
