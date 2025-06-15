package com.april8th;

public class Employee {
	
	String name;
	int id;
	double basicSalary;
	double hra,da;
	
	public Employee(String name,int id,double basicSalary,double hra, double da) {
		
		this.name=name;
		this.id=id;
		this.basicSalary=basicSalary;
		this.hra=hra;
		this.da=da;
	}
	
	public double calculateHRA() {
		double hraAmount=(basicSalary*hra/100);
		return hraAmount;
	}
	
	public double calculateDA() {
		double daAmount=(basicSalary*da/100);
		return daAmount;
	}
	
	public void netSalary() {
		
		double h=calculateHRA();
		double d=calculateDA();
		double netSalary= h + d + basicSalary;
		
		System.out.println("Employee Id: "+ id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee basic salary:  " + basicSalary);
		System.out.println("HRA is: " + hra + "%");
		System.out.println("DA is: " + da + "%");
		System.out.println("Net Salary is: " + netSalary);
		
		
	}
	
	
	
	

}
