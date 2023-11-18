package com.java.ComparatorIn;

import java.util.Comparator;

public class yearComp implements Comparator{

	@Override
	public int compare(Object x, Object y) {
		// TODO Auto-generated method stub
		return ((Compare)x).year-((Compare)y).year;
	}
	
}
