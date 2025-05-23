package com.messageapp;

public class StatusUpload implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
			System.out.println("Uploading status.......");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
