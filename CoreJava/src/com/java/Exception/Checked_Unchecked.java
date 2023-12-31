package com.java.Exception;

public class Checked_Unchecked {
	//throw, throws, throwable
	public static void main(String[] args) {
		/* Checked Exceptions: The classes that directly inherits the throwable class except Runtime Exceptions and errors.
		 * Checked Exceptions are checked in compiler time and exception handler is mandatory for Checked Exceptions.
		 * 
		 * Unchecked Exceptions: The class that inherits the run time exceptions,
		 * exception handler is not mandatory for Unchecked Exceptions.
		 * 
		 * Throw key word is used to thrown an exception, and used inside function and followed by object
		 * Throws key word is used to declare an unhandled checked exception, and used along with the method declaration and followed by class name
		 * Throwable class is the superclass of all the errors and exceptions in java
		 */
		f1();
	}
	static void f1() {
		try {
			throw new ArithmeticException();//throw exception
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void f2() throws ClassNotFoundException {
		throw new ClassNotFoundException();//throw exception
	}
}