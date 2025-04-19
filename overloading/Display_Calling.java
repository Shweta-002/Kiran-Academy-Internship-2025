package com.overloading;

import java.util.*;

public class Display_Calling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter roll no: ");
		int rollNo = sc.nextInt();
		Display d = new Display();
		
		System.out.println("--------Printing name------");
		d.display(name);
		System.out.println("--------- Printing roll no ---------");
		d.display(rollNo);
		System.out.println("---------Printing name and roll no------------");
		d.display(name, rollNo);
	}

}
