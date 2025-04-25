package com.abstractclass_21st_april;

public class Teacher extends Person{

	@Override
	void displayDetails(String name, String designation) {
		System.out.println("Name: " + name);
		System.out.println("Designation is: " + designation);
		
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.displayDetails("Shweta", "Student");
		
		Teacher t=new Teacher();
		t.displayDetails("Anuradha", "Teacher");
	}

}
