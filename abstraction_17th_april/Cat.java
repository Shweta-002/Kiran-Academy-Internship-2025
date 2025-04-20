package com.abstraction_17th_april;

public class Cat implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meowwwwwwwwwww");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("White");
		
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.color();
		c.sound();
	}

}
