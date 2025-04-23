package com.abstraction_18th_april;

public class Cow implements Animal{

	@Override
	public String sound() {
		System.out.println(Animal.name + '\n' + "Class name: Cow");
		return "Hummmmm";
	}
	
	public static void main(String[] args) {
		
		Cow c = new Cow();
		System.out.println(c.sound());
	}

}
