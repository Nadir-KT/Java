package com.java.String;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your String");
		String s1=scn.nextLine();
		s1=s1.toLowerCase();
		int n=s1.length();
		int flag=0;
		for(int i=0;i<n/2;i++)
		{
			if(s1.charAt(i)==s1.charAt(n-1-i))
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	}
}
