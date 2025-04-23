package com.abstraction_18th_april;

public class UPIPayment implements ShoppingCart{

	@Override
	public void checkOut(String paymentType) {
		if(paymentType.equals("UPI")) {
			System.out.println("Payment done with UPI successfuly....");
		}else {
			System.out.println("Payment Failed Retry... ");
		}
		
	}

}
