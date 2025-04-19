package com.overriding;

public class Car extends Vehicle {
	
	public void move() {
		System.out.println("Car is moving");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.move();
	}

}
