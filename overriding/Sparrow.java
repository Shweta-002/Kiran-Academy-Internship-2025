package com.overriding;

public class Sparrow extends Bird{
	
	@Override
	public void fly() {
		System.out.println("This is fly method from sparrow");
	}
	
	public static void main(String[] args) {
		Sparrow s = new Sparrow();
		s.fly();
	}

}
