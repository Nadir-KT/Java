package com.java.Collections;

public class SetIn {
	String name;
	int marks;
	int age;
	public SetIn(String name, int marks, int age) {
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "SetIn [name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public boolean equals(Object x) {
		// TODO Auto-generated method stub
		if(!(x instanceof SetIn))
			return false;
		SetIn s1=(SetIn)x;
		return name.equals(s1.name) && marks==s1.marks && age==s1.age;
	}
	
}
