package com.abstractclass_21st_april;

public class Cow extends Animal {

	@Override
	public void makesound() {
		System.out.println("Cow's sound is Hummmmm");

	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.makesound();
		Cat c = new Cat();
		c.makesound();
		Cow w = new Cow();
		w.makesound();
	}

}
