package com.java.ComparatorIn;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMain {

	public static void main(String[] args) {
		/* The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals if and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S.
		 * public int compare(Object arg, Object arg)
		 * Returns 0 if both are same
		 * Returns +ve No if current instance is bigger than the given instance
		 * Returns -ve No if current instance is smaller than the given instance
		 */
		String []arr = {"java","php","c","android"};
		//Arrays.sort(arr);//Comparable
		Arrays.sort(arr, new LengthCount());
		for(String s:arr) {
			System.out.println(s);//Alphabetical Order
		}
	}

}
