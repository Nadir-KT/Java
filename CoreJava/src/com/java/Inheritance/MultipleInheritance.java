package com.java.Inheritance;
//Inheriting a class from multiple base class is known as multiple inheritance - Java doesn't support multiple inheritance
//Multiple inheritance can be achieved in java using keyword interface
public class MultipleInheritance 
{
	//GeneticFather
	void m1() {}
}
class stepFather
{
	void m1() {}
}
/*class chid extends stepFather,MultipleInheritance
{
	//Diamond Problem: Confusion on which m1() to inherit
}*/