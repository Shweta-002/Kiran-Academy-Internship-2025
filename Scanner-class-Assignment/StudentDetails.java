package com.april8th;
import java.util.*;

public class StudentDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		
		System.out.print("Roll No: ");
		int rollNo=sc.nextInt();
		
		
		System.out.print("Enter First subject marks: ");
		int a=sc.nextInt();
		
		System.out.print("Enter Second subject marks: ");
		int b=sc.nextInt();
		
		System.out.print("Enter Third subject marks: ");
		int c=sc.nextInt();
		System.out.println();
		System.out.println("------Generating Result------");
		System.out.println();
		
		Student s = new Student(name, rollNo, a, b, c);
		s.result();
		
		
		
	}

}
