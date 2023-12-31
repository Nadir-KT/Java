package com.java.Inheritance;
//interface is a type which act as a bridge between two programs
public interface Interface {
	public abstract void on();
	void off();//all methods are public abstract by default in interface, concrete method is not possible in interface
	public static final int a=25;//final variables requires initialization
	int b=20;//all variables are public static final by default in interface
	//Interface(){}//Interfaces cannot have constructors
}
class Fan implements Interface
{//a class extends another class, an interface extends another interface but a class implements an interface
	@Override
	public void on() 
	{
		System.out.println("Fan on");
	}
	@Override
	public void off() {
		System.out.println("Fan off");
	}
}
class Bulb implements Interface
{
	@Override
	public void on() 
	{
		System.out.println("Bulb on");
	}
	@Override
	public void off() 
	{
		System.out.println("Bulb off");
	}
}