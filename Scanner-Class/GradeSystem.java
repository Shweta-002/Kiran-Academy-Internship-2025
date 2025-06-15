package com.practicequestions;

public class GradeSystem {

	public void findGrade(float percentage) {

		if (percentage > 85) {
			System.out.println("Grade: A");
		} else if (percentage >= 60 && percentage <= 85) {
			System.out.println("Grade: B");
		} else if (percentage >= 35 && percentage < 60) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Fail");
		}
	}

}
