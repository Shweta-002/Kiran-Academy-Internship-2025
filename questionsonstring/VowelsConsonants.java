package questionsonstring;

import java.util.*;

public class VowelsConsonants {

	static int vowelcount;
	static int concount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		for (int i = 0; i < string.length(); i++) {
			char a = string.charAt(i);

			switch (a) {
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
				vowelcount++;
				break;

			default:
				concount++;
			}
		}
		
		System.out.println("Count of vowels is: " + vowelcount);
		System.out.println("Count of consonants is: " + concount);
	}

}
