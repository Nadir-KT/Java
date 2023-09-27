package com.java.String;
//StringBuilder and StringBuffer classes are used to create mutable string objects
public class Mutable
{
	public static void main(String[] args)
	{
		String s1="String";
		String s3=s1.concat("Concat");
		System.out.println(s1);
		System.out.println(s3);
		StringBuilder s2=new StringBuilder("StringBuilder");
		s2.append("Append");
		System.out.println(s2);
		StringBuffer s4=new StringBuffer("StringBuffer");
		s4.append("Append");
		System.out.println(s4);
	}
}
/*Why string is immutable:
String objects are cached in the string pool
which are shared between many programs. 
so changes made by one program will affect all other programs
to avoid this risk string is developed as immutable.*/