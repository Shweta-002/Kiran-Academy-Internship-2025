package com.abstraction_18th_april;

public class Cat implements Animal{

	@Override
	public String sound() {
		System.out.println(Animal.name + '\n' + "Class name: Cat");
		return "Meowwwwwwwww";
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.sound());
	}

}
