package com.abstraction_18th_april;

public class Bus implements Transport {

	@Override
	public void BookTicket() {
		System.out.println("Booking ticket for Bus..........");

	}

	public static void main(String[] args) {
		Bus b = new Bus();
		b.BookTicket();

		Train t = new Train();
		t.BookTicket();

		Flight f = new Flight();
		f.BookTicket();
	}

}
