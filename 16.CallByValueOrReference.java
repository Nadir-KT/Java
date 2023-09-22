//Call By Value(Variable), Call By Reference(Pointers/Address) - JAVA does not support call by reference
//RAM Representation - STACK, HEAP, STATIC POOL
class Call
{
	public static void main(String[]args)
	{
		int x=10;
		m1(x);
		System.out.println(x);
	}
	static void m1(int a)
	{
		a=15;
		System.out.println(a);
	}
}