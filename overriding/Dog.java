package com.overriding;

public class Dog extends Animal{
	
	@Override
	public  String sound() {
		System.out.println("Dog is barking");
		return null;
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}

}
