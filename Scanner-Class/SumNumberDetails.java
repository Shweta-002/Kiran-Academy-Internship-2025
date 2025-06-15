package com.practicequestions;

import java.util.Scanner;

public class SumNumberDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = SumNumber.SumNum(num);
		System.out.println("Sum of Numbers is: " + sum);

	}

}
