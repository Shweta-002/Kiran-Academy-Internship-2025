package com.abstractclass_21st_april;

public class Heater extends Appliance {

	@Override
	public void powerConsume() {
		System.out.println("Heater conumes more power as compaired to fan ");

	}

	public static void main(String[] args) {

		Fan f = new Fan();
		f.powerConsume();

		Heater h = new Heater();
		h.powerConsume();
	}

}
