package com.overriding;

public class Eagle extends Bird{
	
	@Override
	public void fly() {
		System.out.println("This is fly method from eagle class");
	}
	
	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		e.fly();
	}

}
