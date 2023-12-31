package com.java.Collections; //10:23

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// Map is a group of key and value pairs
		HashMap<String, Integer> m1=new HashMap<String, Integer>(); // Random Order // HashCode Order
		// public Object put(Object key, Object value)
		m1.put(null, 25);
		m1.put(null, 15);
		m1.put("android", 35);
		m1.put("c", 40);
		m1.put("sql", 18);
		m1.put("asp", 32);
		System.out.println(m1);
		
		LinkedHashMap<String, Integer> m2=new LinkedHashMap<String, Integer>(); // Input Order
		// public Object put(Object key, Object value)
		m2.put("java", 25);
		m2.put("php", 15);
		m2.put("android", 35);
		m2.put("c", 40);
		m2.put("sql", 18);
		m2.put("asp", 32);
		System.out.println(m2);
		
		TreeMap<String, Integer> m3=new TreeMap<String, Integer>(); // Natural Ordering
		// public Object put(Object key, Object value)
		m3.put("java", 25);
		m3.put("php", 15);
		m3.put("android", 35);
		m3.put("c", 40);
		m3.put("sql", 18);
		m3.put("asp", 32);
		System.out.println(m3);
		
		Hashtable<String, Integer> m4=new Hashtable<String, Integer>(); // Random Order
		// public Object put(Object key, Object value)
		m4.put("java", 25);
		m4.put("php", 15);
		m4.put("android", 35);
		m4.put("c", 40);
		m4.put("sql", 18);
		m4.put("asp", 32);
		System.out.println(m4);
		
	    /*----------------+------------+
	    |  HashTable      |   HashMap  |
	    +-----------------+------------+
	    |  Legacy Class   |   JDK 1.2  |
	    +-----------------+------------+
	    | null unAccepted | 1 null key |
	    +-----------------+------------+
	    |  thread safe    |   not      |
	    +-----------------+-----------*/
		
		// public Object get(Object key)
		System.out.println(m4.get("java"));
		// public int size()
		System.out.println(m4.size());
		// public Object keySet()
		System.out.println(m4.keySet());
		
		Iterator<String> itr=m4.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			int val=m4.get(key);
			System.out.println(key + " = "+val);
		}
	}

}
