package com.java.Abstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		Bicycle b1=new Bicycle();
		b1.changeGear(3);
		b1.speedUp(3);
		b1.applyBrake(1);
		System.out.println("Bicycle Out");
		b1.display();
		Bike b2=new Bike();
		b2.changeGear(2);
		b2.speedUp(3);
		b2.applyBrake(1);
		System.out.println("Bike Out");
		b2.display();
	}
}
