package com.abstraction_18th_april;
import java.util.*;

public class Circle implements Shape {

	@Override
	public void area(int length, int breadth) {
		// TODO Auto-generated method stub

	}

	@Override
	public void area(int radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is: " + area);

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		
		Circle c= new Circle();
		c.area(radius);
		
	}

}
