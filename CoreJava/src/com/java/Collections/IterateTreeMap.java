package com.java.Collections;
//Java program to iterate over a TreeMap
import java.util.Map;
import java.util.TreeMap;
public class IterateTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Map<String, String> itm = new TreeMap<String, String>();

		   // enter name/url pair
		   itm.put("Google", "google.com");
		   itm.put("Bing", "bing.com");
		   itm.put("Yahoo", "yahoo.com");
		   itm.put("Amazon", "amazon.com");

		   for (Map.Entry<String, String>
		   entry : itm.entrySet())
		   System.out.println( "[" + entry.getKey() + ", " + entry.getValue() + "]");
	}

}
