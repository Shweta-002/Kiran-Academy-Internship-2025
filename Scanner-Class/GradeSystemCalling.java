package com.practicequestions;

import java.util.*;

public class GradeSystemCalling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage: ");
		float percent = sc.nextFloat();
		GradeSystem g = new GradeSystem();
		g.findGrade(percent);

	}

}
