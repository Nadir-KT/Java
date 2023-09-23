package com.java.Inheritance;
//interface is a mechanism to achieve multiple inheritance in java
public interface InterfaceTwo 
{
	void on();
	void dial();
}
class SmartPhone
{
	void takePhoto()
	{
		System.out.println("Taking Photo");
	}
	void on()
	{
		System.out.println("SmartPhone on");
	}
}
class ClassicPhone extends SmartPhone implements InterfaceTwo 
{
	@Override
	public void dial()
	{
		System.out.println("dialing number");
	}
	@Override
	public void on()
	{
		System.out.println("ClassicPhone on");
	}
}