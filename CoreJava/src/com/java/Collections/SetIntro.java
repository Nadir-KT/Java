package com.java.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetIntro {

	public static void main(String[] args) {
		// Set: HashSet, LinkedHashSet, TreeSet
		// Set is a group of unique elements. which doesn't allows to store duplicate items.
		HashSet s1=new HashSet(); // Random Order // HashCode Order
		s1.add("java");
		System.out.println(s1.hashCode());
		s1.add("php");
		s1.add("android");
		s1.add("python");
		s1.add("java");
		System.out.println(s1);
		
		LinkedHashSet s2=new LinkedHashSet(); // Input Order
		s2.add("java");
		s2.add("php");
		s2.add("android");
		s2.add("python");
		s2.add("java");
		System.out.println(s2);
		
		TreeSet s3=new TreeSet(); // Natural Ordering
		s3.add("java");
		s3.add("php");
		s3.add("android");
		s3.add("python");
		s3.add("java");
		System.out.println(s3);
	}

}
