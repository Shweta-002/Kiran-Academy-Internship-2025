package com.day_1;

public class Marks extends Student {

	int sub1, sub2;
	int total;

	

	public int totalMarks(int sub2, int sub1) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		total = sub1 + sub2;
		return total;

	}

	public void details(String name, int rollNo) {
		System.out.println("Name of student is: " + (this.name = name));
		System.out.println(  "Roll No of student is: " + (this.rollNo = rollNo));
		System.out.println("Marks of sub1: " + sub1);
		System.out.println("Marks of sub2: " + sub2);
		System.out.println("Total marks of subject is: " + totalMarks(sub2, sub1));

	}
}
