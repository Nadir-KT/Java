package com.java.Encapsulation;
//Encapsulation: it is a process of making or declaring fields private and providing access through public methods
//It is a process of wrapping code and data together into a single unit
//Advantages:-
//A class can have total control over it's data members
//The fields of data members can be made read only or write only.
public class Encapsulation 
{
	private String name;
	private int age;
	private double salary;
	//Setters
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	//Getters
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
}
