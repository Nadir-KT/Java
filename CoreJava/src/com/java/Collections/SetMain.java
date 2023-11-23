package com.java.Collections;//5:32

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=new HashSet();
		s1.add(new SetIn("adrian",40,20));
		s1.add(new SetIn("cena",35,21));
		s1.add(new SetIn("adrian",40,20));
		System.out.println(s1);
	}

}
