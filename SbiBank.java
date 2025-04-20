package com.abstraction_17th_april;

public class SbiBank implements Bank {

	@Override
	public void makePayment() {
		System.out.println(
				"This is the abstract method which is declaired under the interface and implemented in this class");

	}

	public static void main(String[] args) {
		SbiBank s = new SbiBank();
		s.makePayment();
	}

}
