package com.chuwa.builder;

public class Bike {
	private Bike(){}
	private Bike(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	private String brand;
	private String color;
	public static class BikeBuilder{
		private String brand,color;
		public BikeBuilder setBrand(String brand){
			this.brand=brand;
			return this;
		}
		public BikeBuilder setColor(String color){
			this.color=color;
			return this;
		}
		public Bike build(){
			return new Bike(this.brand,this.color);
		}
	}
}
