package com.interface_21st_april;

public class Document implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("Show method from Showable interface");

	}

	@Override
	public void print() {
		System.out.println("Print method from printable interface");

	}

	public static void main(String[] args) {
		Document d = new Document();
		d.print();
		d.show();
	}

}
