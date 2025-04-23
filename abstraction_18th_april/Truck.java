package com.abstraction_18th_april;

public class Truck implements Vehicle {
	
	@Override
	public void startEngine() {
		System.out.println("This is Truck's Engine");
		
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.startEngine();
		
		Bike b = new Bike();
		b.startEngine();
		
		Truck t = new Truck();
		t.startEngine();
		
	}

}
