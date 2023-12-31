// Call to this (this()) //Call from one constructor to another
class CThis
{
	int length;
	int breadth;
	public static void main(String[] args)
	{
		CThis t1 = new CThis();
		t1.display();
	}
	CThis()
	{
		this(10,20);// Call to this (this()) //call to this must be first statement in constructor
		System.out.println("Default constructor calling");
	}
	CThis(int l,int b)//Constructor doesn't have return type
	{
		this(25);
		System.out.println("Parameterized Constructor calling, Parameters="+l +b);//Parameterized Constructor
		length=l;
		breadth=b;
	}
	CThis(int n)//Constructor doesn't have return type
	{
		length=breadth=n;
	}
	void display()
	{ 
		System.out.println("Length="+length);
		System.out.println("Breadth="+breadth);
	}
	
}

//https://way2java.com/oops-concepts/difference-between-this-and-this-in-java-with-example/