package com.overloading;

public class Student {
	
	public Student() {
		System.out.println("This is no argument constructor");
	}
	
	public Student(int rollNo) {
		System.out.println("This constructor accept one parameter");
		System.out.println("Roll no is: " + rollNo);
	}
	
	public Student(String name, int rollNo) {
		System.out.println("This constructor accepts two parameters");
		System.out.println("Name is: " + name);
		System.out.println("Roll no is: " + rollNo);
		
	}

}
