package com.practicequestions;

import java.util.Scanner;

public class VowelConsonantDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the alphabet: ");
		char letter = sc.next().charAt(0);
		VowelConsonant v = new VowelConsonant(letter);

	}

}
