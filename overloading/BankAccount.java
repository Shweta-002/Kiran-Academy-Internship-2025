package com.overloading;

public class BankAccount {
	
	public void deposite(int amount) {
		System.out.println(amount  + " deposited to your account");
	}
	
	public void deposite(int amount, String mode) {
		System.out.println(amount + " deposited to your accont with " + mode);
		
	}
	
	

}
