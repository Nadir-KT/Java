package com.java.String;
//Why String is immutable(value will not change)?
//Mutable(value can be changed)
public class Immutable
{
	public static void main(String[] args) 
	{
		String str="java";//Object creation, String is a class //Literal way
		String str1="java";
		str=str.concat(" developer");//String addition and store as a new data in string pool
		System.out.println(str);
		String s1=new String("java");//new Object creation,//Stored in heap outside string pool and points to the data"java" in string pool
		//StringBuilder
		//StringBuffer
	}
}