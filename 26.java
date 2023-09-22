// Static & Nonstatic Block
class Block
{
	static int a;
	int b;
	int c;
	public static void main(String[] args) // JRE first calls static block before main block
	{
		System.out.println("Main Started");
		new Block();//Allocate memory for non-static variable, Non-static block executes when object is created, Execute default constructor, Return reference
		new Block();//Nonstatic block executes when object is created
		new Block();//Nonstatic block executes when object is created
		System.out.println("Main Ended");
	}
	static //static block is used to assingn value for static variable - it executes once when class enters the code segment
	{
		a=25;
		new Block().b=30; //non-static variable b cannot be referenced from a static context without creating object
		System.out.println("Static block calling");
	}
	{ //Nonstatic block is used to assingn value for Nonstatic variable - Nonstatic block executes before the constructor
		b=10;
		c=25;
		System.out.println("Nonstatic block calling");
	}
	Block()//Constuctor
	{ 
		System.out.println("Default constructor calling");
	}
	{ //Nonstatic block is used to assingn value for Nonstatic variable - Nonstatic block executes before the constructor
		b=10;
		c=25;
		System.out.println("Nonstatic block calling");
	}
}