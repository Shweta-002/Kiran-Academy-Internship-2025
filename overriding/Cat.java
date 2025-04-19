package com.overriding;

public class Cat extends Animal{
	
	@Override
	public String sound() {
		System.out.println("Cat sounds like Meow");
		return null;
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		}

}
