package com.java.Inheritance;
//Inheriting a class from multiple base class is known as multiple inheritance - Java doesn't support multiple inheritance
//Multiple inheritance can be achieved in java using keyword interface
public class MultipleInheritance 
{
	//GeneticFather
	void m1() {}
	public static void main(String[] args) {
		//child c1=new child();
		//c1.m1();
	}
}
class stepFather
{
	void m1() {}
}
/* class child extends stepFather,MultipleInheritance
{
	//Diamond Problem: Confusion on which m1() to inherit
} */