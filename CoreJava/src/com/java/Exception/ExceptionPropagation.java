package com.java.Exception;

public class ExceptionPropagation {
	//Exception Propagation: Passing an exception from one method to it's calling method is known as exception propagation
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			staticFun1();
		} catch (Exception e) {
			System.out.println("exception handled in main using ExceptionPropagation");// TODO: handle exception
		}
		System.out.println("main end");
	}
	static void staticFun1() {
		System.out.println("staticFun1 start");
		staticFun2();
		System.out.println("staticFun1 end");
	}
	static void staticFun2() {
		System.out.println("staticFun2 start");
		int a=10/0;//Exception
		System.out.println("staticFun2 end");
	}
}
