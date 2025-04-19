package com.overloading;

public class Calculator {

	public void add(int a, int b) {
		int add = a + b;
		System.out.println("Addition is: " + add);
	}

	public void add(double a, double b) {
		double add = a + b;
		System.out.println("Addition is: " + add);

	}

	public void add(int a, int b, int c) {
		int add = a + b + c;
		System.out.println("Addition is: " + add);

	}

}
