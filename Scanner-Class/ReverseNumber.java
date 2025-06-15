package com.practicequestions;

public class ReverseNumber {

	int rev = 0;

	public ReverseNumber(int num) {
		while (num != 0) {

			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse number is: " + rev);
	}

}
