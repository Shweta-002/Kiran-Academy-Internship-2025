package com.abstraction_17th_april;

public class Gpay implements OnlinePayment {

	@Override
	public void makePayment() {
		System.out.println("Implemented makePayment ()");
		System.out.println("In Gpay class");

	}

	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.makePayment();
	}

}
