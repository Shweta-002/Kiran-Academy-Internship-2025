package com.abstractclass_21st_april;

public class Truck extends Vehicle {

	@Override
	public void move() {
		System.out.println("Truck moves.....");

	}

	public static void main(String[] args) {

		Bike b = new Bike();
		b.move();
		Truck t = new Truck();
		t.move();
	}

}
