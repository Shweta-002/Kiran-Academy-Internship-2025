package com.questions_1;

public class Food {
	
	private String foodItem;
	private int foodQuantity;
	private int foodPrice;
	private String foodTest;
	
	public String getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodTest() {
		return foodTest;
	}
	public void setFoodTest(String foodTest) {
		this.foodTest = foodTest;
	}
	
	public int total() {
		int total = getFoodPrice() * getFoodQuantity();
		return total;
	}
	
	

}
