package com.abstraction_18th_april;

public class AmazonOrder implements OrderPlacement, Payment,Delivery {

	@Override
	public void delivery() {
		System.out.println("Delivery is done..... ");
		
	}

	@Override
	public void payment() {
		System.out.println("Make payment for product");
		
	}

	@Override
	public void order() {
		
		System.out.println("Order placement is done for product Dry Fruits");
		
	}
	
	public static void main(String[] args) {
		
		AmazonOrder a=new AmazonOrder();
		a.order();
		a.payment();
		a.delivery();
	}

}
