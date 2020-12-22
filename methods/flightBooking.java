package com.xworkz.methods;

public class flightBooking {

	public static void Booking(String Name, long phoneNumber) {

		System.out.println("this name and phoneNumber is accepted " + Name + " " + phoneNumber);

	}
	public static void Allot(String nameofclass, int Seatno ) {

		System.out.println("the seat is alloted as per name  " + nameofclass + " " + Seatno);

	}

	
	
	
	
	
	public static void main(String[] args) {

		flightBooking.Booking("veeresh", 123456789);
		flightBooking.Allot("businessclass", 30);
		  // flightBooking.Allotment(business, 10000);

	}

}
