package string_seperation_count;

import java.util.Scanner;

public class CallingFunctionality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a series: ");
		String series = sc.nextLine();
		StringCount st = new StringCount(series);
		st.countString();
		sc.close();

	}

}
