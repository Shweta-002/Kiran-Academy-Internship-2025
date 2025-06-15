package com.april8th;

public class Food {
	
	String customerName;
	int foodItems,price;
	
	public Food(String customerName,int foodItems, int price) {
		
		this.customerName=customerName;
		this.foodItems=foodItems;
		this.price=price;
	}
	
	public void totalBill() {
		
		System.out.println("Customer name: " + customerName);
		System.out.println("Food items ordered: " + foodItems);
		System.out.println("Price of single food item: " + price);
		
		int total=foodItems*price;
		double gst=(total*10/100);
		System.out.println("Total bill: " + total + " +" + " 10% GST added" + " = " + (total + gst) + " Rs.");
	}
	

}
