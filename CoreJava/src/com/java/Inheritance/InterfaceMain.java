package com.java.Inheritance;

public class InterfaceMain {

	public static void main(String[] args) 
	{
		//new Interface();//Object creation not possible in interface//can't instantiate an interface
		Interface i=new Fan();//Upcasting
		i.on();
		i.off();
		i=new Bulb();//RP
		i.on();
		i.off();
		InterfaceTwo c1=new ClassicPhone();
		c1.on();
		SmartPhone s1=new SmartPhone();
		s1.on();
	}
}