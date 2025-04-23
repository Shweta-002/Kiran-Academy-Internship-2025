package com.abstraction_18th_april;

public class Circle1 implements Displayable{

	@Override
	public double area(int r) {
		double area = Displayable.pi * r * r;
		return area;
		
	}

	@Override
	public void display() {
		System.out.println("Area of cirecle is: " + area(5));
		
	}
	
	public static void main(String[] args) {
		Circle1 c=new Circle1();
		c.area(5);
		c.display();
	}

}
