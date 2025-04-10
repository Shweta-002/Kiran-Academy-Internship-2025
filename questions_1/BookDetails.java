package com.questions_1;

import java.util.*;

public class BookDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter book title: ");
		String bookTitle = sc.nextLine();

		System.out.print("Enter book author: ");
		String bookAuthor = sc.nextLine();

		System.out.print("Enter book copies: ");
		int bookCopies = sc.nextInt();

		System.out.print("Enter book price: ");
		int bookPrice = sc.nextInt();
		
		System.out.println();
		System.out.println("------------- Printing book details -------------");
		System.out.println();
		
		Book b=new Book(bookTitle, bookAuthor, bookCopies, bookPrice);
		
		System.out.println("Book title is: " + b.getBookTitle());
		System.out.println("Book author is: " + b.getBookAuthor());
		System.out.println("Available book copies: " + b.getBookCopies());
		System.out.println("Book price: " + b.getBookPrice());

	}

}
