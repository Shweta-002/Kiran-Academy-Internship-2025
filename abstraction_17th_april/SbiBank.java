package com.abstraction_17th_april;

public class SbiBank implements Bank {

	@Override
	public void makePayment() {
		System.out.println("Implemented method from interface Bank");
		
	}
	public static void main(String[] args) {
		SbiBank s = new SbiBank();
		s.makePayment();
	}

}
