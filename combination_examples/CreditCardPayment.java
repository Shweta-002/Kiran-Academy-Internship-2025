package com.combination_examples;

public class CreditCardPayment extends Payment {

	@Override
	public void makePayment() {
		System.out.println("Payment is in process via credit card");

	}

	public static void main(String[] args) {
		CreditCardPayment c = new CreditCardPayment();
		c.makePayment();
	}

}
