package com.java.Array;

public class Array
{
	public static void main(String[] args)
	{
		// datatype arrayname[];
		int number[];
		int []arr=new int[3];
		arr[0]=10;
		arr[1]=21;
		arr[2]=30;
		for(int i=0;i<arr.length;i++)//i<=arr:ArrayIndexOutOfBoundsException
		{
			System.out.println(arr[i]);
		}
	}
}