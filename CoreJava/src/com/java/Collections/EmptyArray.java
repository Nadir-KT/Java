package com.java.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class EmptyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> al= new ArrayList<String>();
        System.out.println("Is ArrayList empty? " + al.isEmpty());
        al.add("Red");
        al.add("Green");
        al.add("Black");
        al.add("White");
        al.add("Pink");
        System.out.println("Array list after adding elements: " + al);
        System.out.println("Is ArrayList empty after adding elements? " + al.isEmpty());
        al.removeAll(al);
        System.out.println("Array list after remove all elements "+al);   
        System.out.println("Is ArrayList empty after remove all elements? " + al.isEmpty());
        al.add("Java");
        al.add("Python");
        System.out.println("Array list after adding elements again: " + al);
        al.clear();
        System.out.println("Array list after clearing elements "+al); 
        System.out.println("Is ArrayList empty after clearing elements? " + al.isEmpty());
	}

}