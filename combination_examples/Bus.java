package com.combination_examples;

public class Bus extends Transport {

	@Override
	public void move() {
		System.out.println("move method is from interface movable");

	}

	@Override
	void capacity() {
		System.out.println("capacity method is from abstract class Transport");

	}

	public static void main(String[] args) {
		Bus b = new Bus();
		b.capacity();
		b.move();
	}

}
