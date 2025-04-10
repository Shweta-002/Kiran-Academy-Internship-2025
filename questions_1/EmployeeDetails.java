package com.questions_1;
import java.util.*;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee id: ");
		int empID=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the employee name: ");
		String empName=sc.nextLine();
		
		System.out.print("Enter the employee designations: ");
		String empDesignation=sc.nextLine();
		
		System.out.print("Enter the employee salary: ");
		double empSalary=sc.nextDouble();
		
		System.out.println();
		System.out.println("--------Printing Employee Details-------");
		System.out.println();
		
		Employee e = new Employee();
		
		e.setEmpID(empID);
		e.setEmpName(empName);
		e.setEmpDesignation(empDesignation);
		e.setEmpSalary(empSalary);
		
		System.out.println("Employee ID: " +e.getEmpID());
		System.out.println("Employee Name: " + e.getEmpName());
		System.out.println("Employee Designation: " + e.getEmpDesignation());
		System.out.println("Employee Salary: " + e.getEmpSalary());

	}

}
