package com.java.ComparatorIn;

import java.util.Comparator;

public class LengthCount implements Comparator{

	@Override
	public int compare(Object x, Object y) {
		// TODO Auto-generated method stub
		return ((String)x).length()-((String)y).length();
	}

}
