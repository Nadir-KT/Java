package com.java.ComparatorIn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Compare []arr= { new Compare("Jon",1001, 2003),
				new Compare("alison",1002, 2010),
				new Compare("ruth",1005, 2020),
				new Compare("ali",99, 1970),
				new Compare("khan",78, 1967)};
		System.out.println("Sorting based on");
		String by=scn.nextLine();
		if(by.equalsIgnoreCase("name"));//Ignore Case Sensitive
		{
			Arrays.sort(arr);
		}
		if(by.equalsIgnoreCase("id"));//Ignore Case Sensitive
		{
			Arrays.sort(arr, new IdComp());
		}
		if(by.equalsIgnoreCase("year"));//Ignore Case Sensitive
		{
			Arrays.sort(arr, new yearComp());
		}
		for(Compare s:arr) {
			System.out.println(s);
		}
	}

}
