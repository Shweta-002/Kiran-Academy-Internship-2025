package com.overriding;

public class Rectangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Rectangle shape");
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
	}

}
