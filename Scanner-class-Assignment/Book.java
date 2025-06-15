package com.april8th;

public class Book {
	
	String bookTitle, bookAuthor;
	int price;
	
	public Book(String bookTitle, String bookAuthor, int price) {
		
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
		
	}
	
	public void display() {
		System.out.println("Book title is: " + bookTitle);
		System.out.println("Book author is: " + bookAuthor);
		System.out.println("Book price is: " + price);
	}
	

}
