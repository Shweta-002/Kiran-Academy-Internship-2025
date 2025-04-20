package com.abstraction_17th_april;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Meowwwwww");
		
	}

	@Override
	public void color() {
		System.out.println("White");
		
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.color();
		c.sound();
	}

}
