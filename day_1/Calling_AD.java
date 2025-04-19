package com.day_1;

import java.util.*;

public class Calling_AD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animal name: ");
		String animalName = sc.nextLine();
		System.out.println("Enter dog name: ");
		String dogName = sc.nextLine();
		
		System.out.println();
		System.out.println("Printing methods of two classes using child class object");
		System.out.println();
		
		Dog d = new Dog(); // object of child class 
		
		d.eat();
		d.animalName(animalName); // calling the methods of two classes using single object
		d.bark();
		d.dogName(dogName);
	}

}
