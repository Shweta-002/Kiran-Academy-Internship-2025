package com.interface_21st_april;

public class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing a circle");

	}

	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw();

		Traingle t = new Traingle();
		t.draw();

		Square s = new Square();
		s.draw();
	}

}
