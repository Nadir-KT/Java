class Object
{
	static String name;
	int price;
	public static void main(String[]args)
	{
		//System.out.println(new Car().price);
		//new Car();//Object creation(copy  of class)
		Object c1 = new Object();
		System.out.println(c1.price);
	}
}