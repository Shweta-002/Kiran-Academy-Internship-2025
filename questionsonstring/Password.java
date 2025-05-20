package questionsonstring;

import java.util.*;

public class Password {

	int count;

	public static void main(String[] args) {
		Password p = new Password();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String pass = sc.nextLine();
		System.out.println("No. of Digits present in password are: " + p.digitCount(pass));
	}

	public int digitCount(String pass) {

		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
