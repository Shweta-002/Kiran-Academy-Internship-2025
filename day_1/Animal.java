package com.day_1;

public class Animal {

	String animalName;

	public void eat() {
		System.out.println("This is animal class method eat()");
	}

	public void animalName(String animalName) {
		this.animalName = animalName;
		System.out.println("Name of animal is: " + animalName);
	}

}
