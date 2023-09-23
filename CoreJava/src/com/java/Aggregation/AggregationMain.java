package com.java.Aggregation;

public class AggregationMain {

	public static void main(String[] args) 
	{
		Aggregation a1=new Aggregation("Eranakulam", "Kerala", "India");
		child c1=new child(2, "Manu", a1);
		child c2=new child(3, "Prabu", a1);
		child c3=new child(4, "Madhu", a1);
		c1.display();
		c2.display();
		c3.display();
	}
	//composition is a special type of aggregation
	//it is considered as a strong type of relationship
	//objects are highly depends upon each other
}
