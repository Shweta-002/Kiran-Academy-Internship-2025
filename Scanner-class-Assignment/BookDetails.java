package com.april8th;
import java.util.*;

public class BookDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter book title: ");
		String title=sc.nextLine();
		System.out.print("Enter book author: ");
		String author=sc.nextLine();
		System.out.print("Enter book price: ");
		int price=sc.nextInt();
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		Book b=new Book(title, author, price);
		b.display();
	}

}
