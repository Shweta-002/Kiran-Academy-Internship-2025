package com.combination_examples;

public class WashingMachine extends ElectronicDevice {

	@Override
	public void operate() {
		System.out.println("...Washing machine is easy to operate...");

	}

	public static void main(String[] args) {

		WashingMachine w = new WashingMachine();
		w.operate();
		ElectronicDevice.handle();
	}

}
