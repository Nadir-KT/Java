package com.java.Array;
import java.util.*;  
public class LargestSmallest {
	public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int max = array[size-3];
	      int low = array[1];
	      System.out.println("3rd largest element is :"+max);
	      System.out.println("2nd smallest element is :"+low);
	   }
	}