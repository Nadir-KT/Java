//copy constructor
class Box
{
	int length;
	int breadth;
	public static void main(String[] args)
	{
		Box r1 = new Box();
		Box r2 = new Box(10,20);
		Box r3 = new Box(r1);
		Box r4 = new Box(r2);
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}
	Box()//Costructor doesn't have return type
	{
		System.out.println("Constructor calling");//Default Constructor
	}
	Box(int l,int b)//Costructor doesn't have return type
	{
		System.out.println("Parameterized Constructor calling, Parameter="+l);//Parameterized Constructor
		length=l;
		breadth=b;
	}
	Box(Box r)//Costructor doesn't have return type
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

//1. Constructor name must be the same as its class name
//2. Constructor must have no return type.
//3. Constructor cannot be static.
//Object Creation: Allocate Memory for nonstatic variable, Execute Default Constructor, Returns reference