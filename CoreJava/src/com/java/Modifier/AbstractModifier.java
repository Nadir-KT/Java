package com.java.Modifier;
//Abstract class: the class is declared with abstract modifier and it can have abstract and non abstract methods
public abstract class AbstractModifier 
{
	//abstract = not completed
	//The abstract method can only be defined by an abstract class
	//The method which is declared with abstract keyword and doesn't have any implementation is known as abstract method
	abstract void on();//abstract method ends with ; and declared with modifier abstract 
	abstract void off(int a);
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

	@Override
	void off(int a) {
		// TODO Auto-generated method stub
		
	}
	void Map()
	{
		//Concrete method
	}
}
abstract class Ford extends AbstractModifier//Make sub class to abstract
{
}
class Maruthi extends AbstractModifier
{
	@Override
	void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void off(int a) {
		// TODO Auto-generated method stub
		
	}
	void Music()
	{
		//Concrete method
	}
}