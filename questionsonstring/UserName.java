package questionsonstring;

import java.util.*;

public class UserName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Full Name: ");
		String name = sc.nextLine();

		for (int i = 0; i < name.length(); i++) {
			if (i == 0 || name.charAt(i - 1) == ' ') {
				System.out.print(Character.toUpperCase(name.charAt(i)) + ".");
			}
		}
	}

}
