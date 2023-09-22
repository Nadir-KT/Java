package com.java.Modifier;
//Abstract class: the class is declared with abstract modifier and it can have abstract and non abstract methods
public abstract class AbstractModifier 
{
	//abstract = not completed
	//The abstract method can only be defined by an abstract class
	//The method which is declared with abstract keyword and doesn't have any implementation is known as abstract method
	abstract void on();
	void m1()
	{
		//Concrete method
	}
	public static void main(String[] args) {
		//new AbstractModifier();//Cannot create object of the abstract class
	}
}
class BMW extends AbstractModifier//The sub class must implement the inherited abstract method using method Override
{
	@Override
	void on() {
		// TODO Auto-generated method stub
	}
}
abstract class Ford extends AbstractModifier//Make sub class to abstract
{
}