package array_demo_example;

import java.util.*;

public class ThirdExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.print("Enter the size of array: ");

		size = sc.nextInt();
		int arr_one[] = new int[size];

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr_one.length; i++) {
			arr_one[i] = sc.nextInt();

		}

		System.out.println("-----Printing the array elements------ ");
		for (int i = 0; i < arr_one.length; i++) {
			System.out.println(arr_one[i]);

		}

	}

}
