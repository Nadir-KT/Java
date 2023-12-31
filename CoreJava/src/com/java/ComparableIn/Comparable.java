package com.java.ComparableIn;

import java.util.Arrays;

public class Comparable {

	public static void main(String[] args) {
		/* ComparableInterface --> java.lang.Comparable
		 * Method: public int compareTo(Object arg)
		 * Returns 0 if both are same
		 * Returns +ve No if current instance is bigger than the given instance
		 * Returns -ve No if current instance is smaller than the given instance
		 */
		String []arr = {"C/C++","JS","Java","Python"};
		Arrays.sort(arr);//Calls compareTo()//Natural Ordering
		for(String s:arr) {
			System.out.println(s);//Alphabetical Order
		}
	}

}
