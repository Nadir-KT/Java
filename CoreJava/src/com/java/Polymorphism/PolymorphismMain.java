package com.java.Polymorphism;

public class PolymorphismMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Rider r1=new Rider();
		Pulsar p1=new Pulsar();
		Bike b1=new Bike();
		r1.ride(p1);//CP - Compile Time Polymorphism 
		r1.ride(b1);//CP
	}
}
//Advantages
//Reusability
//Loose coupling
