package com.interface_21st_april;

public class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Birds are fly in the sky.....");

	}

	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();

		Airplane a = new Airplane();
		a.fly();

	}

}
