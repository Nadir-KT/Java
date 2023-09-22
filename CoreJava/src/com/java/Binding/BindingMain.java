package com.java.Binding;

public class BindingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m0(new A());//Binding b1=new A();
		m0(new B());//Binding b1=new B();
		X x1=new X();
		System.out.println(x1.m1()+x1.m2());//ab
		x1=new Y();
		System.out.println(x1.m1()+x1.m2());//ad
	}
	static void m0(Binding b1) {
		b1.test1();//Late Binding//Runtime Polymorphism//Override methods works based on instance
		Binding.test2();//b1.test2();//Early Binding//Compile time Polymorphism
	}
}
//static, final, private methods takes early binding