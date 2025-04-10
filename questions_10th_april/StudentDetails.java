package com.questions_10th_april;
import java.util.*;

public class StudentDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter marks: ");
		double marks=sc.nextDouble();
		
		System.out.println();
		System.out.println("-------------------- Printing student details ---------------");
		System.out.println();
		
		Student s  = new Student();
		s.setID(id);
		s.setName(name);
		s.setMarks(marks);
		
		System.out.println("Student id is: " + s.getID());
		System.out.println("Student name is: " + s.getName());
		System.out.println("Student marks: " + s.getMarks());
	}

}
