package com.java.Collections;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		/* Generic: generic is a non-primitive type, provided at run time.
		 * Advantage of Generics:-
		 * 1. Type-Safety
		 * 2. Type Casting is not required
		 * 3. Compile time safety
		 */
		ArrayList<String> a1=new ArrayList<String>();//<Generics>
		a1.add("java");
		a1.add("python");
		//a1.add(250); //The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		System.out.println(a1);
		ArrayList<Object> a2=new ArrayList<Object>();//<Object>: Supports all types
		a2.add("java");
		a2.add("python");
		a2.add(250);
		System.out.println(a2);
	}

}
