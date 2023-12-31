package com.java.Exception;
import java.io.IOException;
//final keyword,finally block, finalize() method 
//finalize() method in Java is a method of the Object class that is used to perform cleanup activity before destroying any object.
//It is called by Garbage collector before destroying the objects from memory.
public final class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int b=12;
		//b=13; // cannot inherit final class, cannot override final method, cannot change value of final variable
		System.out.println("main started");
		try 
		{
			int a=10/0;
		} 
		catch (RuntimeException r) //multiple catch block is possible with different types of exceptions
		{
			// TODO: handle exception\
			System.out.println("Executing RuntimeException catch block");
		}
		catch (Exception e) //multiple catch block is possible with different types of exceptions
		{
			// TODO: handle exception\
			System.out.println("Executing Exception catch block");
		}
		finally // multiple finally is not allowed
		{
			// TODO: handle finally clause // finally block executes even there is an exception
			System.out.println("finally block");
			//Cleanup statements
			//Closing database connection
			//Closing files
		}
		System.out.println("main ended");
	}

}
//class demo extends FinallyBlock {} // cannot inherit final class, cannot override final method, cannot change value of final variable

