package com.xworkz.methods;

public class Calculator {
	
	public static void add() {
		int a=20;
		int b=30;
		int sum=0;
		sum=a+b;
		System.out.println("the sum of two number = " + sum);
	}
	public static void add1(int a, int b) {
		int sum=0;
		sum=a+b;
		System.out.println("sum of two no="+sum);
	}
	public static double getpivalue() {
		return 3.142;
	}	
	public static void main (String[] args) {
		int a=20;
		int b=30;
				
		Calculator.add1(a,b);
		double pi=Calculator.getpivalue();
		System.out.println(pi);
		
		
		
		// TODO Auto-generated method stub

	}

}


