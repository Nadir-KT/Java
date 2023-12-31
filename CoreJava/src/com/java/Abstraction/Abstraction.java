package com.java.Abstraction;

import java.io.Serializable;

//Abstraction is a process of hiding the implementation details and showing only functionality to the user
public interface Abstraction//Abstraction is achieved using interface
{
	void changeGear(int g);
	void speedUp(int s);
	void applyBrake(int a);
}
interface Marker
{
	//an empty interface is called marker interface or tag interface
	//it doesn't contains methods, fields and constants
	//just used for categorization
	//ex: Cloneable, Serializable
}
class Bicycle implements Abstraction
{
	int speed=4;
	int gear;
	@Override
	public void changeGear(int g) {
		gear=g;
	}
	@Override
	public void speedUp(int s) {
		speed=s+speed;
	}
	@Override
	public void applyBrake(int a) {
		speed=speed-a;	
	}
	void display()
	{
		System.out.println("Speed="+speed+" gear="+gear);
	}
}
class Bike implements Abstraction
{
	int speed=6;
	int gear;
	@Override
	public void changeGear(int g) {
		gear=g;
	}
	@Override
	public void speedUp(int s) {
		speed=s+speed;
	}
	@Override
	public void applyBrake(int a) {
		speed=speed-a;	
	}
	void display()
	{
		System.out.println("Speed="+speed+" gear="+gear);
	}
}