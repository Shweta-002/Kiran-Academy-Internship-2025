package com.combination_examples;

public class Refrigerator extends Appliance {

	@Override
	public void turnOn() {
		System.out.println("Refrigerator is turn on....");

	}

	@Override
	public void turnOff() {
		System.out.println("Refrigerator is turn off..");

	}

	public static void main(String[] args) {
		Refrigerator r = new Refrigerator();
		r.turnOn();
		r.turnOff();
	}

}
