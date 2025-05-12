package array_demo_example;

import java.util.*;

public class FifthExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter the array elements: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("Printing even numbers from array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}

		}
	}

}
