package com.java.Aggregation;

public class child 
{
	int rollNo;
	String name;
	Aggregation adr;
	public child(int rollNo, String name, Aggregation adr)//Source -> Generate constructor using fields
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.adr = adr;
	}
	void display()
	{
		System.out.println("Roll no="+rollNo);
		System.out.println("Name ="+name);
		System.out.println("Address ="+adr);
	}
}
