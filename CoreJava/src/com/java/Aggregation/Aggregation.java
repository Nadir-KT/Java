package com.java.Aggregation;
//if a class has an another entity reference is called Aggregation
//it represents 'Has-a' relationship.
public class Aggregation 
{
	String city;
	String state;
	String country;
	public Aggregation(String city, String state, String country)//Source -> Generate constructor using fields
	{
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString()//Source -> Generate toString()
	{
		return "Aggregation [city=" + city + ", state=" + state + ", country=" + country + "]";
	}	
}