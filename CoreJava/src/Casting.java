//Type Casting
//1. Widening
//2. Narrowing
class Casting
{
	public static void main(String[] args)
	{
		double d=10;//10.0//Widening
		int a=(int)10.6;//10//Narrowing
		System.out.println(a);
		m1(a);
		m2(a);//Widening
		m3((int)25.5);//Narrowing
		
	}
	static void m1(double b)
	{
		System.out.println("m1 with double args = "+b);
	}
	static void m2(int c)
	{
		System.out.println("m2 with int args = "+c);
	}
	static void m3(int e)
	{
		System.out.println("m1 with int args = "+e);
	}
}