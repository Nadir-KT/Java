package com.java.Classes;

public class ClassesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes a=new Classes(20); // Outer class object
		// Inner class can be referred after creating an outer class object
		Classes.A a1=a.new A(); // Inner class object
		// Inner class can refer all members of outer class including private data member.
		a1.display();
	}

}
