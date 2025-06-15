package com.practicequestions;

public class SumNumber {
	static int sum = 0;

	public static int SumNum(int num) {
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
