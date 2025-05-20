package questionsonstring;

import java.util.*;

public class Gmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email id: ");
		String email = sc.nextLine();

		if (email.contains("gmail")) {
			System.out.println("Email id contains gmail");

		} else if(email.contains("yahoo")){
			System.out.println("Email id contains yahoo");
		}else {
			System.out.println("Invalid email id");
		}
	}

}
