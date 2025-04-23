package com.abstraction_18th_april;

public class CashOnDelivery implements ShoppingCart{

	@Override
	public void checkOut(String paymentType) {
		if(paymentType.equals("Cash")) {
			System.out.println("Payment done with Cash successfuly....");
		}else {
			System.out.println("Payment Failed Retry... ");
		}
		
	}

}
