package com.java.ObjectClass;

public class EqualsMain {

	public static void main(String[] args) 
	{
		Equals e1=new Equals(100,200);
		System.out.println(e1);//type@address
		Equals e2=new Equals(100,200);
		System.out.println(e2);
		System.out.println(e1==e2);
		//public boolean equals(Object args)
		System.out.println(e1.equals(e2));//Reference
		//non primitive
	}
}
