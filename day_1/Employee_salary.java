package com.day_1;
import java.util.*;

public class Employee_salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int empID = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter employee name: ");
		String empName = sc.nextLine();
		
		System.out.println("Enter basic salary: ");
		double salary = sc.nextDouble();
		
		System.out.println();
		System.out.println("--------- Printing Details ------------");
		System.out.println();
		
		Salary s = new Salary(empID, empName, salary);
		s.calculateHRA(salary);
		
		
	}

}
