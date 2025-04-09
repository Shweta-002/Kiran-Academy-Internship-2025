package com.questions_1;

import java.util.*;

public class StudentDetails {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter student name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter fees: ");
		double fees=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter studying year: ");
		String year=sc.nextLine();
		
		Student s=new Student();
		s.setstudID(id);
		s.setstudName(name);
		s.setStudyYear(year);
		s.setStudFees(fees);
		
		System.out.println();
		System.out.println("---------Printing student data------------");
		System.out.println();
		
		System.out.println("Student id is: " + s.getstudID());
		System.out.println("Student name is: " + s.getstudName());
		System.out.println("Student studying year is: " + s.getStudyYear());
		System.out.println("Student fees are: " + s.getStudFees());
	}

}
