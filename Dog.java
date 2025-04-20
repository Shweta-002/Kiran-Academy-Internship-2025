package com.abstraction_17th_april;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Barking");
		
		
	}

	@Override
	public void color() {
		System.out.println("Brown");
		
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.color();
		d.sound();
	}

}
