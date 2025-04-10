package com.questions_10th_april;

import java.util.*;

public class BookDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter book id: ");
		int bookID=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter book title: ");
		String bookTitle = sc.nextLine();
		
		System.out.println("Enter book author: ");
		String bookAuthor=sc.nextLine();
		
		System.out.println("Enter book price: ");
		double bookPrice = sc.nextDouble();
		
		System.out.println();
		System.out.println("---------------- Printing book details ---------------");
		System.out.println();
		
		Book b = new Book();
		b.setBookID(bookID);
		b.setBookTitle(bookTitle);
		b.setBookAuthor(bookAuthor);
		b.setBookPrice(bookPrice);
		
		System.out.println("Book id is: " + b.getBookID());
		System.out.println("Book title: " + b.getBookTitle());
		System.out.println("Book author: " + b.getBookAuthor());
		System.out.println("Book price: " + b.getBookPrice());
	}

}
