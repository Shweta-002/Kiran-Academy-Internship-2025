package com.abstraction_18th_april;

public class FlightService implements Booking,Cancellation,TicketStatus{

	@Override
	public void status() {
		System.out.println("Booking status....");
		
	}

	@Override
	public void cancel() {
		System.out.println("You can cancel your ticket within 24 Hrs");
		
	}

	@Override
	public void booking() {
		System.out.println("Book your ticket through any airline");
		
	}
	
	public static void main(String[] args) {
		 FlightService f=new FlightService();
		 f.booking();
		 f.cancel();
		 f.status();
	}

}
