//constructor overloading
class Box
{
	int height;
	int width;
	int length;
	public static void main(String[] args)
	{
		Box b1 = new Box();
		Box b2 = new Box(10,20,30);
		Box b3 = new Box(25);
		b1.display();
		b2.display();
		b3.display();
	}
	Box()//Costructor doesn't have return type
	{
		System.out.println("Constructor calling");//Default Constructor
	}
	Box(int h,int w,int l)//Costructor doesn't have return type
	{
		System.out.println("Parameterized Constructor calling, Parameter="+h);//Parameterized Constructor
		height=h;
		width=w;
		length=l;
	}
	Box(int a)//Costructor doesn't have return type
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

//1. Constructor name must be the same as its class name
//2. Constructor must have no return type.
//3. Constructor cannot be static.
//Object Creation: Allocate Memory for nonstatic variable, Execute Default Constructor, Returns reference