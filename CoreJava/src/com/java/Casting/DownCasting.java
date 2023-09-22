package com.java.Casting;
//Down casting: The reference of super class object is passed to the child class, Implicitly Down casting is not possible.
public class DownCasting
{
	void task1()
	{
		System.out.println("task 1 in DownCasting");
	}
}
class Down2 extends DownCasting
{
	void task2()
	{
		System.out.println("task 2 in Down2");
	}
}
class Down3 extends DownCasting
{
	void task3()
	{
		System.out.println("task 3 in Down3");
	}
}