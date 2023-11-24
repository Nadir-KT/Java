package com.java.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		// List Iterator: It's an Interface used to iterate elements in both forward and backward direction from a list type.
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(25);
		a1.add(20);
		a1.add(15);
		a1.add(30);
		a1.add(60);
		a1.add(28);
		System.out.println(a1);
		// public ListIterator listIterator()
		ListIterator<Integer> l1=a1.listIterator();
		// public boolean hasNext()
		while(l1.hasNext()) {
		// public Object next()
			System.out.println(l1.next());
		}
		System.out.println("----------");
		// public boolean hasPrevious()
		while(l1.hasPrevious()) {
		// public Object previous()
			System.out.println(l1.previous());
		}
		// public void add(Object element)
		l1.add(100);
		l1.add(200);
		// public int nextIndex()
		System.out.println(l1.nextIndex());
		System.out.println(a1);
		l1.add(500);
		System.out.println(l1.nextIndex());
		System.out.println(a1);
		// public void set(Object element)
		System.out.println(l1.next());
		l1.set(500);
		System.out.println(a1);
		// public void remove()
		// public int previousIndex()
	}

}
