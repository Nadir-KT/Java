package com.java.ObjectClass;

public class EqualsMain {

	public static void main(String[] args) 
	{
		Equals e1=new Equals(100);
		System.out.println(e1);
		Equals e2=new Equals(100);
		System.out.println(e1);
		System.out.println(e1==e2);
	}
}
