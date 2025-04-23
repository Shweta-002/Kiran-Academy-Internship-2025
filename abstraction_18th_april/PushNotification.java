package com.abstraction_18th_april;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Push notification");

	}

	public static void main(String[] args) {

		PushNotification p = new PushNotification();
		p.notifyUser();
		SMSNotification s = new SMSNotification();
		s.notifyUser();
		EmailNotification e = new EmailNotification();
		e.notifyUser();
	}

}
