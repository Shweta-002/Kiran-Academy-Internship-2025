package com.april8th;
import java.util.*;

public class FoodDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.print("Enter how many food items you wany to buy: ");
		int foodItems=sc.nextInt();
		System.out.print("Enter the price of food item: ");
		int price=sc.nextInt();
		System.out.println();
		System.out.println("------------- Generating bill --------------");
		
		Food f=new Food(name, foodItems, price);
		f.totalBill();
				
	}

}
