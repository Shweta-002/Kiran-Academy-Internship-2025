package com.day_1;

public class Dog extends Animal {

	String dogName;

	public void bark() {
		System.out.println("This is dog class method bark()");
	}

	public void dogName(String dogName) {
		this.dogName = dogName;
		System.out.println("Dog name is: " + dogName);
	}

}
