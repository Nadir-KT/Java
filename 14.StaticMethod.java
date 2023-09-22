class Static
{
	public static void main(String[]args)//Main method is called by JRE (Java Runtime Environment)
	{
		m1(10);//Static methods can be called directly
		//new Static().m2();
	}
	//Method Syntax:accessModifier returnType methodName(arguments){}
	static void m1(int a)
	{
		new Static().m2();//object creation is required when calling nonstatic from static
		System.out.println("M1");
	}
	void m2()
	{
		m3();//Nonstatic methods can be called directly from nonstatic method
		System.out.println("M2");
	}
	void m3()
	{
		m4();//Static methods can be called directly
		System.out.println("M3");
	}
	static void m4()
	{
		System.out.println("M4");
	}
}