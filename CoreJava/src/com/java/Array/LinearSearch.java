package com.java.Array;

import java.util.Scanner;

public class LinearSearch {

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
		//Linear Search
		System.out.println("Enter the search element");
		int srch=scn.nextInt();
		int flag = 0,index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==srch) {
				flag=1;
				index=i;
			}
		}
		if(flag==1) {
			System.out.println("Element found at index:"+index);
		}
		else {
			System.out.println("Element not found");
		}
	}

}
