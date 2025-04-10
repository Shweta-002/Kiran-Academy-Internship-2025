package com.questions_1;
import java.util.*;

public class FoodDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food item: ");
		String foodItem = sc.nextLine();
		
		
		System.out.print("Enter food quantity: ");
		int foodQuantity=sc.nextInt();
		
		
		System.out.print("Enter food price: ");
		int foodPrice=sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("Enter food test: ");
		String foodTest=sc.nextLine();
		
		System.out.println();
		System.out.println("------------ Printing food details ------------");
		System.out.println();
		
		Food f = new Food();
		f.setFoodItem(foodItem);
		f.setFoodQuantity(foodQuantity);
		f.setFoodPrice(foodPrice);
		f.setFoodTest(foodTest);
		
		System.out.println("Food item: " + f.getFoodItem() );
		System.out.println("Food quantity: " + f.getFoodQuantity());
		System.out.println("Food price: " + f.getFoodPrice());
		System.out.println("Food test: " + f.getFoodTest());
		
		
		System.out.println("Total amount is: " + f.total()  + "Rs.");
		
		
	}

}
