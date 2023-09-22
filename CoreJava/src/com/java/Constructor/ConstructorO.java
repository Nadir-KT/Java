//constructor overloading
package com.java.Constructor;

 class ConstructorO
{
	int height;
	int width;
	int length;
	public static void main(String[] args)
	{
		ConstructorO b1 = new ConstructorO();
		System.out.println("b1="+b1);//type@address
		ConstructorO b2 = new ConstructorO(10,20,30);
		System.out.println("b2="+b2);//type@address
		ConstructorO b3 = new ConstructorO(25);
		System.out.println("b3="+b3);//type@address
		b1.display();
		b2.display();
		b3.display();
	}
	ConstructorO()//Constructor doesn't have return type
	{
		System.out.println("Default Constructor calling");//Default Constructor
	}
	ConstructorO(int h,int w,int l)//Constructor doesn't have return type
	{
		System.out.println("Parameterized Constructor calling, Parameter="+h);//Parameterized Constructor
		height=h;
		width=w;
		length=l;
	}
	ConstructorO(int a)//Constructor doesn't have return type
	{
		height=width=length=a;
	}
	void display()
	{
		System.out.println("Height="+height);
		System.out.println("Width="+width);
		System.out.println("Length="+length);
	}
	
}