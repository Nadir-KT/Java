class Variables
{
	static String name="i20"; //static/class variable
	int price=9000000; //non-static/instance variable
	public static void main(String[]args)
	{
		String color="Red"; //local variable
		System.out.println(name);
		System.out.println(color);
		System.out.println(new Variables().price);
		//new Car();//Object creation(copy  of class)
		//Car c1=null;//variable
		Variables c1 = new Variables(); //address
		System.out.println(c1.price);
		System.out.println(c1); //type@address
		System.out.println(new Variables()); //type@address
	}
}