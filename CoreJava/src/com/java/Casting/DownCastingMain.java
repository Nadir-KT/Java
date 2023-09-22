package com.java.Casting;

public class DownCastingMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DownCasting d1 = new Down2();//UC implicit
		//d1.task1();
		Down2 d2=(Down2)d1;//Down casting explicit
		d2.task1();
		d2.task2();
	}
}
