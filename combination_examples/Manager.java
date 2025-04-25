package com.combination_examples;

public class Manager extends Employee {

	@Override
	public void getDetails(int Id, String name, String designation) {

		System.out.println("-------Printing employee details------");
		System.out.println("Id: " + Id);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);

	}

	public static void main(String[] args) {

		Manager m = new Manager();
		m.getDetails(101, "Shweta", "Software Engineer");
	}

}
