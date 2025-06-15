package com.practicequestions;

public class LeapYear {

	public void leapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				System.out.println(year + " is leap year");
			} else {
				System.out.println(year + " is not leap year");
			}
		} else {
			System.out.println(year + " is not leap year");
		}
	}
}
