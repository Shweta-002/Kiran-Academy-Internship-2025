package com.questions_10th_april;

public class Book {
	
	private int bookID;
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		
		if(bookPrice < 100) {
			System.out.println("Can not set book price less than 100");
			return 0;
		}
		else {
			return bookPrice;
		}
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	

}
