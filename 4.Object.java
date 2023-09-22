class Car
{
	static String name;
	int price;
	public static void main(String[]args)
	{
		//System.out.println(new Car().price);
		//new Car();//Object creation(copy  of class)
		Car c1 = new Car();
		System.out.println(c1.price);
	}
}