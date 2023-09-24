package com.java.Method;
//Method Overriding:creating a non-static method in sub class with same signature as super class non-static method 
public class Overriding {
	void move()
	{
		System.out.println("Animal moving");
	}

}

class Dog extends Overriding
{
	
}

class Snake extends Overriding
{
	@Override
	void move()//super class method overriding
	{
		System.out.println("Snake moving");
	}
}
/*Rules
1.inheritance is must
2.Method name, return type, argument must be same as super class method
3.Don't use access modifiers that has less visibility than super class method
Visibility reduces from public->protected->default->private
4.Cannot override private methods 
*/