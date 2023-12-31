package com.java.Classes; // 11:53

public class AnonymousClass {
	// Anonymous class : A class without a name, only for using abstract class or Interface
	public static void main(String[] args) {
		// Interface
		Interface i1=new Interface() // Anonymous Inner Type
		{
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("Interface calling M1");
			}
		};
		i1.m1();
		// abstract class
		Abstract a1=new Abstract() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("abstract class calling M1");
			}
		};
		a1.m1();
	}

}
