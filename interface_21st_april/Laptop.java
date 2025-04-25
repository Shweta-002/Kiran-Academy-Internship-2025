package com.interface_21st_april;

public class Laptop implements Chargable {

	@Override
	public void charge() {
		System.out.println("Laptop Takes more time to charge..");

	}

	public static void main(String[] args) {

		Mobile m = new Mobile();
		m.charge();

		Laptop l = new Laptop();
		l.charge();
	}

}
