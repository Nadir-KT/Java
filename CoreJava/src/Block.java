// Static & Non-static Block
class Block
{
	static int a;
	int b;
	int c;
	public static void main(String[] args) // JRE first calls static block before main block
	{
		System.out.println("Main Started");
		new Block();//Allocate memory for non-static variable, Non-static block executes when object is created, Execute default constructor, Return reference
		new Block();//Non-static block executes when object is created
		new Block();//Non-static block executes when object is created
		System.out.println("Main Ended");
	}
	static //static block is used to assign value for static variable - it executes once when class enters the code segment
	{
		a=25;
		//new Block().b=30; //non-static variable cannot be referenced from a static context without creating object
		System.out.println("Static block calling");
	}
	{ //Non-static block is used to assign value for Non-static variable - Non-static block executes before the constructor
		a=20;
		b=10;
		c=25;
		System.out.println("Nonstatic block calling");
	}
	Block()//Constructor
	{ 
		System.out.println("Default constructor calling");
	}
	{ //Non-static block is used to assign value for Non-static variable - Non-static block executes before the constructor
		b=10;
		c=25;
		System.out.println("Nonstatic block calling");
	}
}