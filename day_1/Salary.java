package com.day_1;

public class Salary extends Employee {

	public Salary(int empID, String empName, double salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	public void calculateHRA(double salary) {
		System.out.println("Name of employee is: " + empName);
		System.out.println("Employee Id is: " + empID);
		System.out.println("Basic salary is: " + salary);
		double hra = salary * 10 / 100;
		System.out.println("HRA is: " + hra);
		double da = salary * 20 / 100;
		System.out.println("DA is: " + da);
		double total_salary = (salary - (hra + da));
		System.out.println("Total salary is: " + total_salary);
	}

}
