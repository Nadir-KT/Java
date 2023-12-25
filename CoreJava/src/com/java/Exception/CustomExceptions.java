package com.java.Exception;

import java.util.Scanner;

public class CustomExceptions {
	/* Custom Exceptions: creating our own exception is known as custom exception
	 * Custom exceptions are used to customize the exception according to user need.
	 */
	double balance;
	double Dpin=1234;
	Scanner scn=new Scanner(System.in);
	public CustomExceptions(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws CustomExceptionsOut
	{
		if(balance<amount) {
			System.out.println("Shortage of"+(amount-balance)+"RS");
			throw new CustomExceptionsOut();
		}
		else
		{
			balance-=amount;
			System.out.println("Withdraw Success");
		}
	}
	public void getBalance() {
		System.out.println("Current Balance="+balance);
	}
	public void pinChange(double pin)  throws CustomExceptionsPin
	{
		if(pin==Dpin) {
			System.out.println("EnterNewPin");
			Dpin=scn.nextDouble();
		}
		else
		{
			throw new CustomExceptionsPin();
		}
	}
}