package com.java.Collections;
import java.util.LinkedList;
public class InsertLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an empty linked list
		  LinkedList <String> l_list = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  l_list.add("Red");
		  l_list.add("Green");
		  l_list.add("Black");

		  // print original list
		  System.out.println("Original linked list:" + l_list);

		  // create a new collection and add some elements

		  LinkedList <String> new_l_list = new LinkedList <String> ();
		  new_l_list.add("White");
		  new_l_list.add("Pink");

		  // Add the collection in the second position of the existing linked list
		  l_list.addAll(1, new_l_list);
		  
		  l_list.add(2,"New Color");

		  // print the new list
		  System.out.println("LinkedList:" + l_list);

	}

}
