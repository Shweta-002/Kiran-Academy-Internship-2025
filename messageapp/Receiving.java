package com.messageapp;

public class Receiving extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
			System.out.println("Message is receiving....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		

}
