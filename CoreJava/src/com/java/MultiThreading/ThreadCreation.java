package com.java.MultiThreading;

//public class PrintChars extends Thread
public class ThreadCreation implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method of Print characters started");
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		System.out.println("Run method of Print characters ended");
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		//Thread t1=new PrintChars();
		//t1.start();
		Runnable t1=new ThreadCreation();
		Thread t2=new Thread(t1);
		t2.start();
		for(int i=1;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println("main ended");
	}
	
}