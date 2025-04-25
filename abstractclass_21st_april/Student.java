package com.abstractclass_21st_april;

public class Student extends Person {

	@Override
	void displayDetails(String name,String designation) {
		
		System.out.println("Name: " + name);
		System.out.println("Designation is: "+ designation);
	}

}
