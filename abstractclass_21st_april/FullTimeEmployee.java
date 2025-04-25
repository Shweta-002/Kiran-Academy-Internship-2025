package com.abstractclass_21st_april;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {

	@Override
	public void calculateSalary() {
		
		if (total_salary < 20000) {
			System.out.println("Salary should be greater than Rs.20000");
		} else {
		System.out.println("Total salary for full time employement is: " + (total_salary + 20000));

	}
	}

	public FullTimeEmployee(double total_salary) {
		this.total_salary = total_salary;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total salary: ");
		double salary = sc.nextDouble();

		FullTimeEmployee f = new FullTimeEmployee(salary);
		f.calculateSalary();

		

	}

}
