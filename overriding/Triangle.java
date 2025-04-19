package com.overriding;

public class Triangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Traingle shape");
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
	}
}
