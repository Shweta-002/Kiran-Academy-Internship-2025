package com.interface_21st_april;

public class SBI implements Bank {

	@Override
	public void getRateOfInterest() {
		System.out.println("Rate of interest of SBI is: 9.2");

	}

	public static void main(String[] args) {

		SBI s = new SBI();
		s.getRateOfInterest();

		HDFC h = new HDFC();
		h.getRateOfInterest();

		ICICI i = new ICICI();
		i.getRateOfInterest();
	}

}
