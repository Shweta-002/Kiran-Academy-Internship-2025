package com.questions_10th_april;

import java.util.*;

public class AccountDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter accout number: ");
		long accountNumber = sc.nextLong();
		sc.nextLine();

		System.out.print("Enter account holder name: ");
		String accHolName = sc.nextLine();

		System.out.print("Enter initial balance: ");
		double initialBalance = sc.nextDouble();

		System.out.print("Enter amount to deposite: ");
		double deposite = sc.nextDouble();

		System.out.print("Enter amount to withdraw: ");
		double withdraw = sc.nextDouble();

		System.out.println();
		System.out.println("--------------- Printing Customer Details ----------------");
		System.out.println();

		Account a = new Account();
		a.setAccountNumber(accountNumber);
		a.setAccHolName(accHolName);
		a.setInitialBalance(initialBalance);
		a.setDeposite(deposite);
		a.setWithdraw(withdraw);
		
		System.out.println("Account number: " + a.getAccountNumber());
		System.out.println("Account holder name: " + a.getAccHolName());
		System.out.println("Initial balance: " + a.getInitialBalance());
		System.out.println("Deposite amount: " + a.getDeposite());
		System.out.println("Withdraw amount: " + a.getWithdraw());
		System.out.println("Total balance is: " + a.gettotalBalance());

	}

}
