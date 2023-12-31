package com.java.Array;

import java.util.Arrays;

public class ArrayListImplimentation //Unlimited size & type
{
	Object[]arr=new Object[3]; // Object type: Unlimited type (both primitive & non primitive types)
	private int index=0;
	public void add(Object elements) // For adding elements
	{
		if(index>=arr.length)
			increase();
		arr[index++]=elements;
	}
	public void increase() // For increasing elements
	{
		//System.out.println("calling");
		int newsize=arr.length+(arr.length/2);
		Object[]newArr=new Object[newsize];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		//System.out.println(newArr.length);
		arr=newArr;//Address of arr=newArr
	}
	public Object get(int getIndex) // For getting index
	{
		if(getIndex>=index) {
			throw new IndexOutOfBoundsException();
		}
		return arr[getIndex];
	}
	public int size() // For checking size
	{
		return index;
	}
	@Override
	public String toString() // For printing array in String
	{
		if(size()==0)
			return "[]";
		String s1="["+get(0);
		for(int i=1;i<size();i++)
		{
			s1=s1+","+get(i);
		}
		s1=s1+"]";
		return s1;
	}
	public void delete(int index) {
		arr[index]="";
	}
}
