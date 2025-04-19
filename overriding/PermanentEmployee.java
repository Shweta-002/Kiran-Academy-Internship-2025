package com.overriding;

public class PermanentEmployee extends Employee {
	
	@Override
	public void calculateSalary() {
		System.out.println("Salary of permanent employee is 50000 Rs.");
	}
	
	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee();
		p.calculateSalary();
	}

}
