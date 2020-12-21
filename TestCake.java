package com.xworkz.bakery;

public class TestCake {

	public static void main(String[] args) {
		Cake cake = new Cake();
		HoneyCake honeyCake = new HoneyCake();
		cake.setColor("Brown");
		cake.setName("apppleCake");
		cake.setShape("round");
		honeyCake.setTaste("sweet");
		cake.setPrice(15);
		System.out.println("cake color is " + cake.getColor());
		System.out.println("cake name is " + cake.getName());
		System.out.println("cake Shape is " + cake.getShape());
		System.out.println("cake price is " + cake.getPrice());
		System.out.println("cake taste is " + honeyCake.getTaste());
	}
	

}
