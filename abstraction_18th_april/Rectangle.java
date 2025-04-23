package com.abstraction_18th_april;
import java.util.*;

public class Rectangle implements Shape {

	@Override
	public void area(int l,int b) {
		int area = l*b;
		System.out.println("Area of reactangle is: " + area);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int l=sc.nextInt();
		System.out.println("Enter breadth: ");
		int b=sc.nextInt();
		
		Rectangle r=new Rectangle();
		r.area(l, b);
		
		
		
	}

	@Override
	public void area(int radius) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
