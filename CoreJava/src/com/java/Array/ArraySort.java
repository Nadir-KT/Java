package com.java.Array;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scn.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("Revrse elements are:");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("largest value in the array = "+max);
		//Bubble Sort
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println("Bubble Sorted Array = ");
		for(int a:arr) {
			System.out.println(a);
		}
		//Selection Sort
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					index=j;
				}
			}
			int value=arr[index];
			arr[index]=arr[i];
			arr[i]=value;
		}
		System.out.println("Selection Sorted Array = ");
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
