package com.java.Method;

public class Over_riding 
{
	void m1()
	{
		System.out.println("m1 in Over_riding");
	}
	void m2()
	{
		System.out.println("m2 in Over_riding");
	}
}
class A extends Over_riding
{
	@Override//Annotations - informations for compiler 
	void m1()
	{
		System.out.println("m1 in A");
	}
}
class B extends A
{
	@Override//Not mandatory - giving hints to compiler for faster executions 
	void m2()
	{
		System.out.println("m2 in B");
	}
}