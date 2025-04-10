package com.questions_1;

import java.util.*;

public class HospitalDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter patient id: ");
		int patientID = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter patient name: ");
		String patientName = sc.nextLine();

		System.out.print("Enter patient blood group: ");
		String patientBloodGroup = sc.nextLine();

		System.out.print("Enter patient disease: ");
		String patientDisease = sc.nextLine();
		
		System.out.println();
		System.out.println("------------ Printing patient details ----------");
		
		Hospital h=new Hospital();
		h.setPatientID(patientID);
		h.setPatientName(patientName);
		h.setPatientBloodGroup(patientBloodGroup);
		h.setPatientDisease(patientDisease);
		
		System.out.println("Patient ID: " + h.getPatientID());
		System.out.println("Patient name: " +h.getPatientName());
		System.out.println("Patient blood group: " + h.getPatientBloodGroup());
		System.out.println("Patient disease: " + h.getPatientDisease());
		

	}

}
