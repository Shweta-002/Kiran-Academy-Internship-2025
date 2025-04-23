package com.abstraction_18th_april;

public class Calculator implements Arithmetic{

	

	@Override
	public void add(int a, int b) {
		System.out.println("Addition is: " + (a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction is: " + (a-b));
		
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Multiplication is: " + (a*b));
		
	}

	@Override
	public void divide(int a, int b) {
		System.out.println("Division is: " + (a/b));
		
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add(3, 4);
		c.sub(4, 6);
		c.multiply(4, 8);
		c.divide(4, 2);
	}

}
