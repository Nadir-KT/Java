package com.java.Array;

import java.util.Scanner;

//Array is an object which is used to store same type of elements, arrays in java are index based.
public class Array
{
	public static void main(String[] args)
	{
		// dataType arrayName[]; //Syntax: Array without size
		int number[]= {2,4,7,8,9};
		int []arr=new int[5]; //Array with size 5
		arr[0]=10;
		arr[1]=21;
		arr[2]=30;
		String[]d=new String[4];
		d[0]="java";
		d[1]="HTML";
		d[2]="CSS";
		d[3]="JS";
		System.out.println(arr);//Print address of the array
		for(int i=0;i<number.length;i++)//i<=number:ArrayIndexOutOfBoundsException
		{
			System.out.print(number[i]+"\n");
		}
		// for(dataType variableName:arrayName){} //Syntax: for each
		for(int a:arr) {
			System.out.println(a);
		}
		for(String a:d) {
			System.out.println(a);
		}
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scn.nextInt();
		int[]arr1=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scn.nextInt();
		}
		System.out.println("Arrary elements are:");
		for(int a:arr1) {
			System.out.println(a);
		}
	}
}