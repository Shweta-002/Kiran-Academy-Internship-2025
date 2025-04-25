package com.abstractclass_21st_april;

import java.util.*;

public class Circle extends Shape {

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public void calculateArea() {

		double area = 3.14 * r * r;
		System.out.println("Area of circle is: " + area);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		
		Circle c = new Circle(r);
		c.calculateArea();

	}

}
