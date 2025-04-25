package com.abstractclass_21st_april;

import java.util.*;

public class Rectangle extends Shape {

	public Rectangle(int l, int b) {
		this.b = b;
		this.l = l;
	}

	@Override
	public void calculateArea() {
		int area = l * b;
		System.out.println("Area of rectangle is: " + area);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int l = sc.nextInt();
		System.out.println("Enter breadth: ");
		int b = sc.nextInt();

		Rectangle r = new Rectangle(l, b);
		r.calculateArea();
	}

}
