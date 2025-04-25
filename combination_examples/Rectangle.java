package com.combination_examples;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a shape Rectangle");

	}

	@Override
	public void area(int l, int b) {
		System.out.println("Area of rectangle is: " + (l * b));

	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.draw();
		r.area(5, 8);
	}

}
