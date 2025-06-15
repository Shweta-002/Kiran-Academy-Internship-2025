package com.practicequestions;

public class GreatestNumber {

	public void findGreatestNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greater number");

		} else {
			System.out.println(num3 + " is greater number");
		}
	}

}
