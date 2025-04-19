package com.overloading;

import java.util.*;

public class Area_calling {

	public static void main(String[] args) {

		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		a.area(radius);

		System.out.println("Enter the lenght: ");
		int length = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the breadth: ");
		int breadth = sc.nextInt();
		a.area(length, breadth);

		System.out.println("Enter the side: ");
		int side = sc.nextInt();
		a.area(side);

	}

}
