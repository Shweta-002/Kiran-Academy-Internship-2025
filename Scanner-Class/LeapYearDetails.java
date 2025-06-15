package com.practicequestions;

import java.util.*;

public class LeapYearDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		LeapYear l=new LeapYear();
		l.leapYear(year);

	}

}
