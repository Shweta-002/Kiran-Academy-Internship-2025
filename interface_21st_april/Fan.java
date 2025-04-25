package com.interface_21st_april;

import java.util.*;

public class Fan implements RemoteControl {

	@Override
	public void turnOff() {
		System.out.println("Fan is turn off");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Fan is turn on");
		
	}
	
	public void action(int choice) {
		if (choice == 1) {
			turnOn();
		} else if (choice == 2) {
			turnOff();
		} else {
			System.out.println("Invalid input");
		}
	}

	public static void main(String[] args) {

		System.out.println("1. Turn on" + '\n' + "2. Turn off");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		Fan f = new Fan();
		f.action(choice);

	}

}
