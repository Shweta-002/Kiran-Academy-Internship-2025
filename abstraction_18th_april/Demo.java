package com.abstraction_18th_april;

public class Demo implements Printable, Showable {

	@Override
	public void display() {
		System.out.println("override single method ");

	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}

}
