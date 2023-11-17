package com.java.ComparableIn;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableOverride[]arr= {new ComparableOverride("java", 340),
				new ComparableOverride("php", 210), new ComparableOverride("c", 180),
				new ComparableOverride("android", 150)};
		Arrays.sort(arr);
		for(ComparableOverride c:arr) {
			System.out.println(c);
		}
	}

}
