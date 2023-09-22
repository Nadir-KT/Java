package com.java.ReturnObject;

import java.util.Scanner;

public class BookCreator {

	static Book createNewBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title");
		String t=sc.next();
		System.out.println("Enter the author");
		String a=sc.next();
		System.out.println("Enter the price");
		double p=sc.nextDouble();
		return new Book(t, a, p);
	}
}
