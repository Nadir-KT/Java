package com.java.Exception;

import java.util.Scanner;

public class CustomExceptionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int d=0;
		CustomExceptions account=new CustomExceptions(5000);
		do
		{
			System.out.println("1->Check Balance");
			System.out.println("2->Cash Withdraw");
			System.out.println("3->Pin Change");
			int ch=scn.nextInt();
			switch (ch) {
			case 1:
				account.getBalance();
				break;
			case 2:
				System.out.println("Enter the amount");
				double f=scn.nextDouble();
				try {
					account.withdraw(f);
				} catch (CustomExceptionsOut e) {
					System.out.println("Withdraw failure");// TODO Auto-generated catch block
					//e.printStackTrace();
					account.getBalance();
				}
				break;
			case 3:
				System.out.println("Enter your old pin");
				double g=scn.nextDouble();
				try {
					account.pinChange(g);
				} catch (CustomExceptionsPin e) {
					System.out.println("pinChange failure");// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
			System.out.println("Do you want to continue: ");
			System.out.println("0->continue       1->Exit");
			d=scn.nextInt();
		}while(d==0);
		System.out.println("Thank you");
	}
}
