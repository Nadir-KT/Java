package com.java.Casting;

public class Upcasting 
{
	void test1()
	{
		System.out.println("test 1 in Upcating");
	}
}
class A extends Upcasting 
{
	void test2()
	{
		System.out.println("test 2 in A");
	}
	@Override
	void test1()
	{
		System.out.println("test 1 in A");
	}
}
class B extends Upcasting 
{
	void test3()
	{
		System.out.println("test 3 in B");
	}
	@Override
	void test1()
	{
		System.out.println("test 1 in B");
	}
}