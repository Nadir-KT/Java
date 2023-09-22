//this keyword is used to call non-static variables or functions inside a class
class THIS
{
	int i;
	int j;
	public static void main(String[] args)
	{
		THIS a1 = new THIS();
		a1.setValue(10,20);
	}
	void setValue(int i,int j)
	{
		this.i=i;//Syntax this.nonstatic
		j=j;
		this.display();
		m1();
	}
	void display()
	{
		System.out.println("Value of i="+i);
		System.out.println("Value of j="+j);
	}
	static void m1()//non-static variable cannot be referenced from a static context
	{
	}
	
}