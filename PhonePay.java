package com.abstraction_17th_april;

public class PhonePay implements OnlinePayment {

	@Override
	public void makePayment() {
		System.out.println("Implementing abtract method in PhonePay class...");
		System.out.println("Which is declaired under the interface OnlinePayment");

	}

	public static void main(String[] args) {
		PhonePay p = new PhonePay();
		p.makePayment();
	}

}
