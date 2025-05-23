package com.messageapp;

public class Sending extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			
		System.out.println("Message is sending.....");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

}
