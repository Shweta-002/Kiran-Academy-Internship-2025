package com.questions_10th_april;

public class Car {

	private String model;
	private int year;
	private double price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		
		if(price < 0) {
			System.out.println("Price can not be less than 0");
			return 0;
		}else {
			return price;
		}
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
