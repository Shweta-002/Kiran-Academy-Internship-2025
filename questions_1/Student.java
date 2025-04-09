package com.questions_1;

public class Student {

	private int studID;
	private String studName;
	private double studFees;
	private String studyYear;

	public void setstudID(int studID) {
		this.studID = studID;
	}

	public int getstudID() {
		return studID;
	}

	public void setstudName(String name) {
		studName = name;
	}

	public String getstudName() {
		return studName;
	}

	public double getStudFees() {
		return studFees;
	}

	public void setStudFees(double studFees) {
		this.studFees = studFees;
	}

	public String getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(String studyYear) {
		this.studyYear = studyYear;
	}

}
