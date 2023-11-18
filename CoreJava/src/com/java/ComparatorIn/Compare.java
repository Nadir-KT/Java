package com.java.ComparatorIn;

import java.lang.Comparable;

public class Compare implements Comparable<Object>
{
	String name;
	int id;
	int year;
	
	public Compare(String name, int id, int year) {
		super();
		this.name = name;
		this.id = id;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Compare [name=" + name + ", id=" + id + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Object x) {
		Compare s1=(Compare)x;
		return name.compareTo(s1.name);
	}
}
