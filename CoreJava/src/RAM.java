//RAM Representation - STACK, HEAP, STATIC POOL - 16
//Class Load -> Memory allocation for static variable in static pool one time with latest value-> Call main function -> main function moves to stack -> Each time when new objects are created non static variable get seperate memory allocated in heap -> Each new functions get added to stack memory with Memory allocation for local variable in the same stack fragment-> LIFO(GARBAGE COLLECTOR)
class RAM
{
	static int i;
	int j;
	public static void main(String[] args)//JRE
	{
		System.out.println("Execution Begins");
		RAM.i=10;//A value can be assigned to static variable by direct assign or with class name
		RAM a1 = new RAM();
		a1.i=10;
		a1.j=20;
		RAM a2 = new RAM();
		a2.i=30;
		a2.j=40;
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a2.i);
		System.out.println(a2.j);
		i=50;
		a2.m1();
		System.out.println("Execution Ends");
	}
	void m1()
	{
		int d=10;
		System.out.println("m1 calling");
	}
}