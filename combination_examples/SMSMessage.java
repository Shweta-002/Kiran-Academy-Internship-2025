package com.combination_examples;

public class SMSMessage extends EmailMessage {

	@Override
	public void notification() {
		System.out.println("SMS Notification");

	}

	public static void main(String[] args) {

		SMSMessage s = new SMSMessage();
		s.notification();

		EmailMessage e = new EmailMessage();
		e.notification();
	}

}
