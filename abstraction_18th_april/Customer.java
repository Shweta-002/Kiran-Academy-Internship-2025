package com.abstraction_18th_april;

import java.util.*;

public class Customer implements ATM {

	@Override
	public void withdraw(int amount) {
		System.out.println("Total balance after withdraw is: " + (ATM.initial_balance - amount));

	}

	@Override
	public void deposite(int amount) {
		System.out.println("Total balance after deposite is: " + (ATM.initial_balance + amount));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Customer c = new Customer();
		
		
		System.out.println("Enter amount to withdraw");
		int amount = sc.nextInt();
		c.withdraw(amount);
		
		System.out.println("Enter amount to deposite");
		int amount1 = sc.nextInt();
		c.deposite(amount1);
		
		

	}

}
