package com.overloading;
import java.util.*;

public class BankDetails {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposite: ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the deposite mode cash or cheque: ");
		String mode = sc.nextLine();
		
		BankAccount b = new BankAccount();
		b.deposite(amount);
		b.deposite(amount, mode);
		
	}

}
