package com.messageapp;

public class MediaUpload extends Thread implements Runnable{
	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
			System.out.println("Uploading images....");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
