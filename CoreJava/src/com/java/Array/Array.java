package com.java.Array;
//Array is an object which is used to store same type of elements, arrays in java are index based.
public class Array
{
	public static void main(String[] args)
	{
		// datatype arrayname[]; //Syntax: Array without size
		int number[]= {2,4,7,8,9};
		int []arr=new int[3]; //Array with size 3
		arr[0]=10;
		arr[1]=21;
		arr[2]=30;
		System.out.println(arr);//Print address of the array
		for(int i=0;i<number.length;i++)//i<=arr:ArrayIndexOutOfBoundsException
		{
			System.out.print(number[i]+"\t");
		}
	}
}