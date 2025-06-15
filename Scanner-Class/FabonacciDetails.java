package com.practicequestions;

import java.util.Scanner;

public class FabonacciDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		Fibbonaci f = new Fibbonaci();
		f.display(num);
	}

}
