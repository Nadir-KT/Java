// Call to this (this())
class This
{
	int length;
	int breadth;
	public static void main(String[] args)
	{
		This t1 = new This();
		t1.display();
	}
	This()
	{
		this(10,20);// Call to this (this()) //call to this must be first statement in constructor
		System.out.println("Default constructor calling");
	}
	This(int l,int b)//Costructor doesn't have return type
	{
		this(25);
		System.out.println("Parameterized Constructor calling, Parameters="+l +b);//Parameterized Constructor
		length=l;
		breadth=b;
	}
	This(int n)//Costructor doesn't have return type
	{
		length=breadth=n;
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
//https://way2java.com/oops-concepts/difference-between-this-and-this-in-java-with-example/