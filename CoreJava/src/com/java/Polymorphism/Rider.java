package com.java.Polymorphism;
//OverLoading
public class Rider
{
	void ride(Bike b)
	{
		System.out.println("Executing ride with Bike arguments");
		b.start();//RP - Runtime Polymorphism 
	}
	void ride(Pulsar b)
	{
		System.out.println("Executing ride with Pulsar arguments");
		b.start();//RP
	}
}
