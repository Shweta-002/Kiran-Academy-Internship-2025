package com.practicequestions;

public class VowelConsonant {

	public VowelConsonant(char letter) {

		switch (letter) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(letter + " is vowel");
			break;

		default:
			System.out.println(letter + " is consonant");
		}
	}

}
