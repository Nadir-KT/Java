class Car
{
	static String name="i20"; //static/class variable
	int price=9000000; //nonstatic/instance variable
	public static void main(String[]args)
	{
		String color="Red"; //local variable
		System.out.println(name);
		System.out.println(color);
		System.out.println(new Car().price);
		//new Car();//Object creation(copy  of class)
		//Car c1=null;//variable
		Car c1 = new Car(); //address
		System.out.println(c1.price);
		System.out.println(c1); //type@address
		System.out.println(new Car()); //type@address
	}
}