package com.april8th;
import java.util.*;

public class Bank {
	String holderName;
	double balance;
	
	public Bank(double balance, String holdername) {
		this.balance=balance;
		this.holderName=holdername;
	}
	
	public void deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount to deposite: ");
		double amount=sc.nextDouble();
		double currentBalance = this.balance + amount;
		System.out.println("Available balance is: " + currentBalance + "Rs."); 
	}

	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		double amount=sc.nextDouble();
		double currentBalance = this.balance - amount;
		System.out.println("Available balance is: " + currentBalance + "Rs." ); 
	}
	
	public void balanceCheck(int num) {
		if(num==1) {
			deposite();
		}else if(num==2) {
			withdraw();
		}else {
			System.out.println("Invalid input");
		}
	}

}
