package com.abstraction_18th_april;
import java.util.*;

public class CreditCardPayment implements ShoppingCart {

	@Override
	public void checkOut(String paymentType) {
		if(paymentType.equals("Credit Card")) {
			System.out.println("Payment done with credit card successfuly....");
		}else {
			System.out.println("Payment Failed Retry... ");
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the payment method");
		String pay_method = sc.nextLine();

		CashOnDelivery c = new CashOnDelivery();
		c.checkOut(pay_method);

		UPIPayment u = new UPIPayment();
		u.checkOut(pay_method);

		CreditCardPayment d = new CreditCardPayment();
		d.checkOut(pay_method);
	}

}
