package com.abstraction_18th_april;

import java.util.*;

public class CreditCardPayment1 implements PaymentGateway, RefundService, NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Credit Card Notification: " + message);

	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunding Rs. " + amount + " to your credit card.");

	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment Rs. " + amount);

	}

	public static void main(String[] args) {
		 CreditCardPayment1 c=new CreditCardPayment1();
		 c.processPayment(4000);
		 c.refund(3000);
		 c.sendNotification("Transaction completed....");

	}

}
