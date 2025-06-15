package com.april8th;

import java.util.*;

public class BankDetails {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account holder name: ");
		String name = sc.nextLine();
		System.out.print("Enter initial balance: ");
		double balance = sc.nextDouble();
		
		Bank b=new Bank(balance,name);
		System.out.println();
		System.out.println("1. Deposite money");
		System.out.println("2. Withdraw money");
		int num=sc.nextInt();
		
		b.balanceCheck(num);

	}

}
