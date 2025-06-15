package com.practicequestions;

import java.util.*;

public class FactorialDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		Factorial f = new Factorial();
		int fact = f.fact(num);
		System.out.println("Factorial of " + num + " is: " + fact);
	}

}
