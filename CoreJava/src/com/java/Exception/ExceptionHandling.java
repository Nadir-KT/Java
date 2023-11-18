package com.java.Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// Exceptions - Runtime UnExpectated Errors
		//1.ArithmeticException
		int a=10,b=0;//c=a/0=Exception
		int c=0;
		try {
			System.out.println("try start");
			c=a/b;//Statement
			System.out.println("try end");
		} catch (Exception e) // use specific "catch (ArithmeticException e)" for filtering
		{
			System.out.println("catch start");
			c=0;//Solution: handle exception
			//e.printStackTrace();
			System.out.println("catch end");
		}
		System.out.println(c);
		//2.ArrayIndexOutOfBoundsException
		int []arr=new int[3];
		try {
			arr[3]=55;
		} catch (Exception e) // can find the specific exception using "e.printStackTrace();"
		{
			System.out.println("invalid index");// TODO: handle exception
			e.printStackTrace();
		}
		//3.NullPointerException
		String s1=null;
		try {
			System.out.println(s1.length());
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		//4.ClassCastException
		int i=42;
		Object k=Integer.valueOf(i);
		String d=(String)k;
		System.out.println(d);
	}

}
