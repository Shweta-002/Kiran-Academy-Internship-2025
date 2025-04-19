package com.overloading;

public class Display {
	
	public void display(String name) {
		System.out.println("Name is: " + name);
		
	}
	public void display(int rollNo) {
	System.out.println("Roll No is: " + rollNo);	
	}
	
	public void display(String name, int rollNo) {
		System.out.println("Name is: " + name);
		System.out.println("Roll no is: " + rollNo);
		
	}

}
