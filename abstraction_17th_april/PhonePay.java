package com.abstraction_17th_april;

public class PhonePay implements OnlinePayment {

	@Override
	public void makePayment() {
		System.out.println("Implemented method makePayment()");
		System.out.println("In PhonePay class");
		
	}
	public static void main(String[] args) {
		PhonePay p = new PhonePay();
		p.makePayment();
	
	}

}
