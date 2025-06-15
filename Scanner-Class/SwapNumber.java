package com.practicequestions;

public class SwapNumber {

	public SwapNumber(int num1, int num2) {

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("------------After swapping-----------");
		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);
	}

}
