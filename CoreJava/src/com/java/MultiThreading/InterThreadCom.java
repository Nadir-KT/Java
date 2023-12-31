package com.java.MultiThreading;

public class InterThreadCom {
	double balance=5000;
	synchronized public void withdraw(double amt)
	{
		System.out.println("Going to withdraw");
		if(amt>=balance) {
			System.out.println("Less balance please wait for depositing");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance-=amt;
		System.out.println("withdraw completed");
		System.out.println("Current Balance = "+balance);
	}
	
	synchronized void deposit(double dep) {
		System.out.println("Depositing the amount");
		balance+=dep;
		System.out.println("Depositing completed");
		notify();
	}
	
}
