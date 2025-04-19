package com.overloading;

import java.util.*;

public class Calculator_Calling {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator ca = new Calculator();

		System.out.println("Enter the number 1: ");
		int a = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int b = sc.nextInt();
		ca.add(a, b);

		System.out.println();
		System.out.println("---------- addition of double data type -----------");
		System.out.println();

		System.out.println("Enter number 1: ");
		double c = sc.nextDouble();
		System.out.println("Enter number 2: ");
		double d = sc.nextDouble();
		ca.add(c, d);

		System.out.println();
		System.out.println("----------- addition of 3 integers -------------");
		System.out.println("Enter number 1: ");
		int e = sc.nextInt();
		System.out.println("Enter number 2: ");
		int f = sc.nextInt();
		System.out.println("Enter number 3: ");
		int g = sc.nextInt();
		ca.add(e, f, g);

	}

}
