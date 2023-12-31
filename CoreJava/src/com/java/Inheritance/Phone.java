package com.java.Inheritance;
//Inheritance is a process in which acquiring properties from one type to another type
//Inheriting a class from multiple base class is known as multiple inheritance - Java doesn't support multiple inheritance
//Advantages: Less Dev time, Less Memory consumption, Improved Performance, Redundancy(Code De-duplication)
public class Phone //Super class OR Base class OR Parent class
{
	int a=10;//data members = variables + methods(functions)
	void on()//private methods cannot be inherited
	{
		System.out.println("Phone on");
	}
	void off()
	{
		System.out.println("Phone off");
	}
}

class iphone extends Phone //Sub class OR Child class
{
	void takePhoto()
	{
		System.out.println("Take Photo");
	}
	void iosUpdate()
	{
		System.out.println("Updating to ios Version: "+a);
	}
}

class iphone12 extends iphone
{
	void faceDetection()
	{
		System.out.println("Face Detection");
	}
}