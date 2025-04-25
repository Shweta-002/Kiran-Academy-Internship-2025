package com.abstractclass_21st_april;

public abstract class BankAccount {

	double initial_balance;
	public static final double rate=2.5;

	

	public double deposite(double deposite, double initial_balance) {
		
		System.out.println("Deposited amount is: " + deposite);
		double total_amount = initial_balance + deposite;
		return total_amount;
	}

	public double withdraw(double withdraw, double initial_balance) {
		System.out.println("Withdraw amount is: " + withdraw);
		double total_amount = initial_balance - withdraw;
		return total_amount;

	}
	


	public abstract double calculateInterest(double amount,int year);

}
