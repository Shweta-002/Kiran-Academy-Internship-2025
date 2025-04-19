package com.overriding;

public class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle shape");
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
	}

}
