package com.java.ObjectClass;

public class EqualsMain {

	public static void main(String[] args) 
	{
		Equals e1=new Equals(100,200);
		System.out.println(e1);//type@address
		Equals e2=new Equals(100,200);
		System.out.println(e2);
		System.out.println(e1==e2);//can be used to check primitive & non primitive
		//public boolean equals(Object args)//can be used to check non primitive based on properties
		System.out.println(e1.equals(e2));//Reference
		//non primitive
		System.out.println(10==10);
	}
}
