package com.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListIn {

	public static void main(String[] args) {
		/* List: ArrayList, LinkedList, Vector
		 * Queue:
		 * Set:
		 */
		List l1=new ArrayList();//UpCating //Subclass(ArrayList) instance to SuperType(List)
		//public void add(Object element)
		l1.add(25);
		l1.add(30);
		l1.add("java");
		l1.add(35.8);
		l1.add("java");
		//public void add(int index, Object element)
		l1.add(2, 500);
		System.out.println(l1);
		//public Object get(int index)
		System.out.println(l1.get(3));
		//public void set(int index, Object element)
		l1.set(1, "python");
		System.out.println(l1);
		//public void remove(int index)
		l1.remove(2);
		System.out.println(l1);
		//public int indexOf(Object element)
		System.out.println(l1.indexOf("java"));
		//public int lastIndexOf(Object element)
		System.out.println(l1.lastIndexOf("java"));
		//public List subList(int fromIndex, int toIndex)
		System.out.println(l1.subList(1, 2));
		//public ListIterator listIterator()
		/* ArrayList vs LinkedList
		 * ArrayList vs Vector
		 * Vector vs LinkedList
		 */
	}

}
