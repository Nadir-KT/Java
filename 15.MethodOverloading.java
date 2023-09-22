//Method Overloading - Compile Time Polymorphism(single symbol to represent multiple different types)
class Math
{
	public static void main(String[]args)//Main method is called by JRE (Java Runtime Environment), method main(String[]) can be only defined once in the class
	{
		System.out.println("Main method with String array Argument");//JRE automatically calls Main method with String array Argument
		area(0.5,6.4,7.2);//Compliler decides which method to choose based on length and type of arguments
		area(10,20);
		area(3.14,4,3);
		area();
		area("Single String Argument");
		main();//method main other than main(String[]) needs to be called manually in main(String[])
		main(10);
	}
	//Method Syntax:accessModifier returnType methodName(arguments){}
	static void area(int width, int height)//Rectangle area
	{
		System.out.println("Rectangle area="+(width*height));//println works as method overloading
	}
	static void area(double PI, int radius1, int radius2)//Circle area
	{
		System.out.println("Circle area="+(PI*radius1*radius2));
	}
	static void area(double half, double breadth, double height)//Triangle area
	{
		System.out.println("Triangle area="+(half*breadth*height));
	}
	static int area()
	{
		System.out.println("Without Argument");
		return 10;
	}
	static String area(String s)
	{
		System.out.println("String Argument");
		return "java";
	}
	public static void main()
	{
		System.out.println("Main method with no Argument");
	}
	public static void main(int c)
	{
		System.out.println("Main method with integer Argument");
	}
}