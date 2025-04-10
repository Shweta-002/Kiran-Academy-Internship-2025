package com.questions_10th_april;
import java.util.*;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter emp ID: ");
		 int empID =sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Enter employee name: ");
		 String empName = sc.nextLine();
		 
		 System.out.println("Enter employee salary: ");
		 double empSalary = sc.nextDouble();
		 
		 System.out.println();
		 System.out.println("------------ Printing Employee Details ------------");
		 System.out.println();
		 
		 Employee e = new Employee();
		 e.setEmpID(empID);
		 e.setEmpName(empName);
		 e.setEmpSalary(empSalary);
		 
		 System.out.println("Employee id: " + e.getEmpID());
		 System.out.println("Employee name: " + e.getEmpName());
		 System.out.println("Employee salary: " + e.getEmpSalary() + " Rs");
	}

}
