package com.java.Casting;

public class UpcastingMain {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A a1=new A();
		a1.test1();
		a1.test2();
		Upcasting u1=new A();//Upcasting//can access methods in super class only
		//Casting subclass instance to super type variable is known as upcasting
		u1.test1();//Runtime Polymorphism//Override methods works based on instance
		//u1.test2();//Required downcasting
		Upcasting u2=new B();
		u2.test1();//Runtime Polymorphism//Override methods works based on instance
		m1(new Upcasting());//Upcasting u2=new Upcasting();
		m1(new A());//Upcasting u2=new A();
		m1(new B());//Upcasting u2=new B();
	}
	static void m1(Upcasting u2)//name of the class is also a type
	{
		System.out.println("Executing m1");
	}
}
