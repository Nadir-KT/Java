//copy constructor
package com.java.Constructor;

class ConstructorC
{
	int length;
	int breadth;
	public static void main(String[] args)
	{
		ConstructorC r1 = new ConstructorC();
		ConstructorC r2 = new ConstructorC(10,20);
		System.out.println("r1="+r1);//type@address
		ConstructorC r3 = new ConstructorC(r1);
		System.out.println("r2="+r2);//type@address
		ConstructorC r4 = new ConstructorC(r2);
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}
	ConstructorC()//Constructor doesn't have return type
	{
		System.out.println("Constructor calling");//Default Constructor
	}
	ConstructorC(int l,int b)//Constructor doesn't have return type
	{
		System.out.println("Parameterized Constructor calling, Parameter="+l);//Parameterized Constructor
		length=l;
		breadth=b;
	}
	ConstructorC(ConstructorC r)//copy constructor = copy from existing reference(address)
	{
		length=r.length;
		breadth=r.breadth;
	}
	void display()
	{
		System.out.println("Length="+length);
		System.out.println("Breadth="+breadth);
	}
	
}