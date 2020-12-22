package com.xworkz.methods;

public class ZoomApp {
	public static boolean isValid(String email) {
		String Email = "veereshdm@gmail.com";

		return email.matches(Email);

	}

	public static boolean isValid2(String phoneNumber) {

		String Email = "9999999998";
		return phoneNumber.matches(Email);
	}

	public static void main(String[] args) {
		String email = "veereshdm@gmail.com";
		String phoneNumber = "9999999998";
		System.out.println("the email id is valid: = " + email);
		System.out.println("is the email id is valid? " + isValid(email));
		System.out.println("the phone number is = " + phoneNumber);
		System.out.println("the phone no is valid? " + isValid2(phoneNumber));

	}

}
