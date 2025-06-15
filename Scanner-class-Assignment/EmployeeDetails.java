package com.april8th;
import java.util.*;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter id: ");
		int id=sc.nextInt();
		
		System.out.print("Enter basic salary: ");
		double salary=sc.nextDouble();
		
		System.out.print("Enter HRA percentage: ");
		double hra=sc.nextDouble();
		
		System.out.print("Enter DA percentage: ");
		double da=sc.nextDouble();
		
		System.out.println();
		System.out.println("----------Salary Slip------------");
		System.out.println();
		
		Employee e=new Employee(name, id, salary, hra, da);
		
		e.netSalary();
		
		
		
	}

}
