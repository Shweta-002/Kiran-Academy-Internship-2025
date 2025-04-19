package com.overloading;

public class Area {

	double radius;
	int length, breadth;
	int side;

	public void area(double radius) {
		this.radius = radius;
		double area = (3.14 * radius * radius);
		System.out.println("Area of circle is: " + area);

	}

	public void area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		int area = length * breadth;
		System.out.println("Area of rectangle is: " + area);
		

	}

	public void area(int side) {
		this.side = side;
		int area = side * side;
		System.out.println("Area of square is: " + area);
		

	}

}
