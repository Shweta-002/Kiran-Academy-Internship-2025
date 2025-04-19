package com.day_1;
import java.util.*;

public class Student_Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		String name = sc.nextLine();
		
		System.out.println("Enter roll No: ");
		int rollNo = sc.nextInt();
		
		System.out.println("Enter marks of subject 1: ");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter marks of subject 2: ");
		int sub2 = sc.nextInt();
		
		System.out.println();
		System.out.println("------------- Display details of student -------------");
		System.out.println();
		
		Marks m=new Marks();
		m.totalMarks(sub2, sub1);
		m.details(name, rollNo);
		
		
	}

}
