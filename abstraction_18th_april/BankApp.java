package com.abstraction_18th_april;
import java.util.*;



public class BankApp implements Deposite, Withdraw, BalanceCheck{
	
	int initial_balance;
	
	public BankApp(int initial_balance) {
		this.initial_balance=initial_balance;
		
	}

	@Override
	public int balanceCheck(int deposite,int withdraw) {
		int totoal_balance = initial_balance+deposite-withdraw;
		return totoal_balance;
		
	}

	@Override
	public int withdraw(int amount1) {
		return amount1;
		
	}

	@Override
	public int deposite(int amount) {
		return amount;
		
	}
	
	public void details(int amount, int amount1) {
		System.out.println("Initial balance is: " + initial_balance);
		System.out.println("Deposite amount is: " + deposite(amount));
		System.out.println("Withdraw amount is: " + withdraw(amount1));
		System.out.println("Total balance is: " + balanceCheck(amount, amount1));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter initial balance: ");
		int initia_balance = sc.nextInt();
		
		BankApp b =new BankApp(initia_balance);
		
		System.out.println("Enter amount to deposite: ");
		int amount=sc.nextInt();
		
		
		System.out.println("Enter amount to withdraw: ");
		int amount1=sc.nextInt();
		
		
		System.out.println("---------Printing details-----------");
		b.details(amount, amount1);
		
		
		
		
	}
	
	

}
