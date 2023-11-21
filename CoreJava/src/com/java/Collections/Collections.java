package com.java.Collections;//17:00

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// Methods of collection interface
		ArrayList a1=new ArrayList(); // Create object of array list
		ArrayList a2=new ArrayList();
		// public boolean add(Object ele)
		a1.add(25);
		a1.add("java");
		a1.add("c++");
		a1.add(25.8);
		a2.add(67);
		a2.add("python");
		a2.add("JS");
		a2.add(0.8);
		// public boolean addAll(Collection arg)
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a2);
		// public int size()
		System.out.println(a1.size());
		// public void clear()
		a1.clear();
		System.out.println(a1);
		// public boolean isEmpty()
		System.out.println(a1.isEmpty());
		
	}

}
