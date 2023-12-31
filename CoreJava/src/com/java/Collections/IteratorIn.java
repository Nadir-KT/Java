package com.java.Collections;//4:46

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIn {

	public static void main(String[] args) {
		/* java.util.Iterator
		 * public Object next() // returns next element from a collection type
		 * public boolean hasNext() // check for next element and returns true/false
		 * public void remove() // it will remove an element from a collection type but remove should call after calling next method
		 */
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("java");
		a1.add("php");
		a1.add("python");
		a1.add("c++");
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		Iterator itr=a1.iterator();
		itr.next();
		itr.remove();
		/* while(itr.hasNext())
		{
			System.out.println(itr.next());
		} */
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
		System.out.println(a1);
	}

}
