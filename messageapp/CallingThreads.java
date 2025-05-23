package com.messageapp;

public class CallingThreads {
	public static void main(String[] args) {

		Sending s = new Sending();
		Receiving r = new Receiving();
		Notification n = new Notification();
		StatusUpload st = new StatusUpload();
		MediaUpload m = new MediaUpload();

		s.start();
		r.start();

		Thread t = new Thread(n);
		t.start();

		Thread t1 = new Thread(st);
		t1.start();

		m.start();
	}

}
