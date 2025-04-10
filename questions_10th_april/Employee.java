package com.questions_10th_april;

public class Employee {
	
	private int empID;
	private String empName;
	private double empSalary;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		
		if(empSalary < 10000) {
			System.out.println("Salary can not less than 10000 Rs.");
			return 0;
		}else {
			return empSalary;
		}
		
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	

}
