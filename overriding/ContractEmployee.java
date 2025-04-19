package com.overriding;

public class ContractEmployee extends Employee{
	
	@Override
	public void calculateSalary() {
		System.out.println("Salary of contract based employee is 35000 Rs.");
	}
	
	public static void main(String[] args) {
		ContractEmployee c = new ContractEmployee();
		c.calculateSalary();
	}
	

}
