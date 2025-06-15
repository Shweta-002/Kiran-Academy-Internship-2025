package com.practicequestions;

import java.util.Scanner;

public class CallingGreatestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = s.nextInt();
		System.out.print("Enter second number: ");
		int num2 = s.nextInt();
		System.out.print("Enter third number: ");
		int num3 = s.nextInt();
		
		GreatestNumber g = new GreatestNumber();
		g.findGreatestNumber(num1, num2, num3);
	}

}
