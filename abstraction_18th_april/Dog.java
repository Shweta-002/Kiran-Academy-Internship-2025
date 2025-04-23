package com.abstraction_18th_april;

public class Dog implements Animal{

	@Override
	public String sound() {
		System.out.println(Animal.name + '\n' + "Class name: Dog");
		return "Barking";
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		System.out.println(d.sound());
	}

}
