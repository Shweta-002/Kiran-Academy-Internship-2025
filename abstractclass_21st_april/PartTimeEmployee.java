package com.abstractclass_21st_april;

import java.util.*;

public class PartTimeEmployee extends Employee {

	@Override
	public void calculateSalary() {

		if (total_salary < 20000) {
			System.out.println("Salary should be greater than Rs.20000");
		} else {
			System.out.println("Salary for part time employeement is: " + (total_salary - (total_salary/2)));

		}
	}

	public PartTimeEmployee(double total_salary) {
		this.total_salary = total_salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total salary: ");
		double salary = sc.nextDouble();

		

		PartTimeEmployee p = new PartTimeEmployee(salary);
		p.calculateSalary();

	}

}
