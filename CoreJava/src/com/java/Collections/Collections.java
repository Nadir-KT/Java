package com.java.Collections;

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
		//public boolean contains(Object arg)
		System.out.println(a2.contains(0.8));
		System.out.println(a2);
		//public boolean containsAll(Collection arg)
		System.out.println(a1.containsAll(a2));
		//public boolean remove(Object arg)
		a2.remove("python");
		System.out.println(a2);
		a1.add(67);
		//public boolean removeAll(Collection arg)
		a2.removeAll(a1);
		System.out.println(a2);
		//public int hashCode()
		System.out.println(a1.hashCode());
		//public boolean equals(Object arg)
		System.out.println(a1.equals(a2));
		//public Object[] toArray()
		Object[]arr=a2.toArray();//Object[]arr is used to store unlimited types
		for(Object s:arr)
		{
			System.out.println(s);
		}
		//public Iterator iterator()
	}

}
