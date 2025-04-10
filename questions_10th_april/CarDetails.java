package com.questions_10th_april;

import java.util.*;

public class CarDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter car model: ");
		String model = sc.nextLine();
		
		System.out.println("Enter car year: ");
		int year = sc.nextInt();
		
		System.out.println("Enter car price: ");
		double price = sc.nextDouble();
		
		System.out.println();
		System.out.println("----------- Printing Car Details------------");
		System.out.println();
		
		Car c = new Car();
		
		c.setModel(model);
		c.setYear(year);
		c.setPrice(price);
		
		System.out.println("Car model is: " + c.getModel());
		System.out.println("Car year is: " + c.getYear());
		System.out.println("Car price is: " + c.getPrice());
		
	}

}
