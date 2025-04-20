package com.abstraction_17th_april;

public class Gpay implements OnlinePayment {

	@Override
	public void makePayment() {
		System.out.println("Implementing abtract method in Gpay class...");
		System.out.println("Which is declaired under the interface OnlinePayment");

	}

	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.makePayment();
	}

}
