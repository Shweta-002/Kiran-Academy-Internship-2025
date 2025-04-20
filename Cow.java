package com.abstraction_17th_april;

public class Cow implements Animal{

	@Override
	public void sound() {
		System.out.println("Moooo");
		
	}

	@Override
	public void color() {
		System.out.println("Black");
		
	}
	public static void main(String[] args) {
		Cow c = new Cow();
		c.sound();
		c.color();
	}

}
