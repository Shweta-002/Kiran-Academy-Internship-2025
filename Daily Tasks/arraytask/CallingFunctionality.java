package arraytask;

import java.util.Scanner;

public class CallingFunctionality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		ArrayTask at = new ArrayTask(size);
		at.arraySwap();
		
	}

}
