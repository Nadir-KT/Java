package com.java.Encapsulation;

public class EncapsulationClass {

	public static void main(String[] args)
	{
		Encapsulation e1=new Encapsulation();
		e1.setName("John");
		e1.setAge(25);
		e1.setSalary(1000000);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
	}
}
