package com.april8th;
import java.util.*;

public class Student {
	
	String name;
	int rollNo;
	int a,b,c;
	
	public Student(String name,int rollNo,int a,int b,int c) {
		this.name=name;
		this.rollNo=rollNo;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void result() {
		System.out.println("Student name is:" + name);
		System.out.println("Student id is: " + rollNo);
		int total=a+b+c;
		System.out.println("Total marks: " + total);
		
		double avg = total/3;
		System.out.println("Average is: " + avg);
		
		if(avg>=85 && avg<=100) {
			System.out.println("Grade: A");
		}else if(avg>=65 && avg<85) {
			System.out.println("Grade: B");
		}else if(avg>=50 && avg<65) {
			System.out.println("Grade: C");
		}else {
			System.out.println("Grade: Fail");
		}
			
		
	}

}
