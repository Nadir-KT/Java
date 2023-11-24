package com.java.ObjectClass;

public class ToString 
{
	int pages;
	int price;
	public ToString(int pages, int price) // Constructor 
	{
		super();
		this.pages = pages;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "ToString[pages="+pages+", price="+price+"]";
	}
}
