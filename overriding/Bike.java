package com.overriding;

public class Bike extends Vehicle {
	
	public void move() {
		System.out.println("Bike is moving");
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.move();
	}

}
