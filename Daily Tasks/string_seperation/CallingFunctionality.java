package string_seperation;

import java.util.Scanner;

public class CallingFunctionality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String name = sc.nextLine();
		
		StringSeperation ss = new  StringSeperation(name);
		ss.stringSeperation();
	}

}
