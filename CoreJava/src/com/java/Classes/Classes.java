package com.java.Classes;

public class Classes {
	/* Nested Class: Java inner class or nested class that is declared inside the class or interface.
	 * There are two types of Nested class, Static and non-static nested class.
	 * non-static nested class is also called inner class.
	 */
	private int i;
	public Classes(int i) {
		this.i=i;
	}
	class A // inner class
	{
		void display() {
			System.out.println(i);
		}
	}
	static class B // nested class
	{
		
	}
}
