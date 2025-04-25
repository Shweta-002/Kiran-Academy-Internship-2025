package com.abstractclass_21st_april;

import java.util.*;

public class BankCalculation extends BankAccount {

	@Override
	public double calculateInterest(double amount, int year) {

		double interest = (amount * BankAccount.rate * year)/100;
		return interest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankCalculation b = new BankCalculation();

		System.out.println("Enter initial balance: ");
		double amount = sc.nextDouble();

		System.out.println("Enter amount to deposite: ");
		double deposite = sc.nextDouble();

		System.out.println("Enter amount to withdraw: ");
		double withdraw = sc.nextDouble();
		
		double balance =  b.deposite(deposite, amount);
		System.out.println("Amount after deposite is: " + balance);
		
		
		double total_amount = b.withdraw(withdraw, balance);
		System.out.println("Amount after withdraw is: " + total_amount);
		
		System.out.println("Enter how many years you want to keep your money in bank: ");
		int year = sc.nextInt();
		
		double interest = b.calculateInterest(total_amount, year);
		System.out.println("Interest amount is: " + interest);

	}

}
