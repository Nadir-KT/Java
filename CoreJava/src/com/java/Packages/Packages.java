package com.java.Packages;

import java.util.Scanner;//Inbuilt package

import com.java.String.Strings; //Import custom package

//packages: it is a mechanism to encapsulate a group of classes, sub packages, and interfaces are used for preventing naming conflicts
//import java.util.*;//*:means import all classes inside util
public class Packages 
{
	public static void main(String[] args) {
		new Strings();//Public can access outside packages
	}
}
