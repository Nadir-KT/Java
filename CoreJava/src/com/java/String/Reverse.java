package com.java.String;

import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your String");
		String s1=scn.nextLine();
		//String r = reverse(s1);
		//System.out.println("Reverse of entered string: "+r);
		System.out.println("Reverse of entered string: "+reverse(s1));
	}
	public static String reverse(String s)
	{
		String rev="";
		if(s==" "||s==null)
		{
			return null;
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
}
