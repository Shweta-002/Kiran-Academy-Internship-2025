package arraytask;

import java.util.Scanner;

public class ArrayTask {
	
	int size;

	public ArrayTask(int size) {
		this.size = size;
	}

	
	
	public void arraySwap() {
		
		int arr[] = new int[size];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array is: " + size);
		
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements of array is: ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		for(int i=0;i<arr.length;i+=2) {
			int temp =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		
		System.out.println("After swapping the pair of array elements: ");
		
		for (int element : arr) {
			System.out.println(element);
		}
		
	}

}
