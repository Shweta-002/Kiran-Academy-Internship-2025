package array_demo_example;

import java.util.*;

public class FourthExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[7];
		int sum=0;
		System.out.println("Enter the array elements: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("Sum of array elements is: " + sum);

	}

}
