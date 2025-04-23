package com.abstraction_18th_april;

public class UPIPayment1 implements PaymentGateway, RefundService, NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("UPI Payment Notification: " + message);

	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunding Rs. " + amount + " through UPI.");

	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing UPI payment Rs. " + amount);

	}

	public static void main(String[] args) {
		UPIPayment1 u = new UPIPayment1();
		u.processPayment(4000);
		u.refund(3000);
		u.sendNotification("Transaction completed....");

	}

}
