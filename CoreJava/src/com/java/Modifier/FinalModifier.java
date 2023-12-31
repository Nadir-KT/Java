package com.java.Modifier;

public final class FinalModifier //can't inherit or extend a final class
{
	final static int a=10;//constants//can't change the value of a final variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a++);//The final field cannot be reassigned
	}
	final void m1()//can't override a final method
	{
		System.out.println("m1 in final");
	}
}
/*class Test extends FinalModifier
{
	@Override//Not mandatory - giving hints to compiler for faster executions 
	void m1()//can't override a final method
	{
		System.out.println("m1 in Test");
	}
}*/
//can't change the value of a final variable
//The final field cannot be reassigned
//can't inherit or extend a final class