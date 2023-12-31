package com.java.Constructor;
//Constructor Chaining - Calling immediate super class constructor from sub class constructor
public class ConstructorChaining //extends Object
{
	public ConstructorChaining() {
		//super();//call to super: to object class
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of grand parent class");
	}
}

class parent extends ConstructorChaining
{
	public parent(int child) {
		//super();//call to super: called as default no need to mention [super();]
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of parent class "+child);
	}
}

class child extends parent
{
	public child() {
		//super();//call to super: used to call super class constructor
		super(10);//call to super with arg is required when parent is a parameterized constructor
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of child class");
		//super(10);//Constructor call must be the first statement in a constructor
	}
}