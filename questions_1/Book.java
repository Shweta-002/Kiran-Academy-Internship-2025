package com.questions_1;

public class Book {

	private String bookTitle;
	private String bookAuthor;
	private int bookCopies;
	private int bookPrice;

	public Book(String bookTitle, String bookAuthor, int bookCopies, int bookPrice) {
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookCopies = bookCopies;
		this.bookPrice = bookPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public int getBookCopies() {
		return bookCopies;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
	

}
