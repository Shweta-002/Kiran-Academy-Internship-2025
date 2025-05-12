package array_demo_example;

import java.util.*;

public class SixthExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//System.out.println("-------Printing sorted array------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			

		}
		
		System.out.println("Largest number is: " + arr[arr.length-1]);
	}

}
