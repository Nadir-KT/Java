package com.java.ObjectClass;

public class Equals extends Object//By default all classes inherit object class
{
	int pages;//100
	int price;//200
	Equals(int p, int r)
	{
		pages=p;
		price=r;
	}
	@Override
	public boolean equals(Object x)
	{
		if(!(x instanceof Equals))
		return false;
		//return pages==((Equals)x).pages;//100==100
		return (pages==((Equals)x).pages)&&(price==((Equals)x).price);//100==100
	}
}
