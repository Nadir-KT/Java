package com.java.BoxingUnboxing;

public class BoxingUnboxing {

	public static void main(String[] args) {
		/* Boxing: Automatic conversion of primitive data type into its equivalent wrapper class is known as Boxing.
		 * Unboxing: The opposite operation of Boxing.
		 */
		/* Primitive  | Wrapper Class
		 * -----------|--------------
		 * byte       | Byte
		 * short      | Short
		 * int        | Integer
		 * long       | Long
		 * float      | Float
		 * double     | Double
		 * char       | Character
		 * boolean    | Boolean
		 */
		//Before Java Version 5
		int i=10;
		Integer s=new Integer(i);//Boxing
		System.out.println(s);
		int k=s.intValue();//UnBoxing
		System.out.println(k);
		Double l=new Double(25.5);//Boxing
		System.out.println(l.doubleValue());//UnBoxing
		//Since Java 5: AutoBoxing & AutoUnboxing
		Integer d=25;//AutoBoxing: int-->Integer(AutoBoxing)-->Object(AutoUpcasting)
		System.out.println(d);
		int h=(int)d;//AutoUnboxing: Object-->(Integer)DownCasting-->int(AutoBoxing)
		System.out.println(h);
		//Wrapper Class=NonPrimitive
		Boolean b=false;//NonPrimitive(Wrapper Class)
		System.out.println(b);
	}
}
