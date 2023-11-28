package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {25,14,17,25,47,78};
		List<Integer> l1=new ArrayList();
		l1=Arrays.asList(arr);//Returns a fixed-size list backed by the specified array
		System.out.println(l1);
		for(int i:l1) {
			System.out.println(i);
		}
		l1.forEach(i->System.out.println(i));//Lambda Expression
	}

}
