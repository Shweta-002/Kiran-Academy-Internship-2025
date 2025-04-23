package com.abstraction_18th_april;

public class MarathiGreeting implements Greeting {

	@Override
	public void sayHello() {
		System.out.println("Namaskar.....!!");

	}

	public static void main(String[] args) {

		MarathiGreeting m = new MarathiGreeting();
		m.sayHello();
		EnglishGreeting e = new EnglishGreeting();
		e.sayHello();
	}

}
