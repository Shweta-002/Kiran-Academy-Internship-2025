package com.overloading;
import java.util.*;
public class Student_Calling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter roll no: ");
		int rollNo=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		Student s = new Student(name,rollNo);
		
	}

}
