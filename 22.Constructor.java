//constructor is a special method that is used to initialize an object of a class. It is called when an object is created using the "new" keyword. The constructor has the same name as the class and it does not have a return type.
class A
{
	String name;
	int age;
	double salary;
	public static void main(String[] args)
	{
		new A();//calling will happen if a new constructor instance(obeject) is created
		A b = new A("Tony",10,25000);//constructor is used to initialize the state(properties) of an object
		b.display();
	}
	A()//Costructor doesn't have return type
	{
		System.out.println("Constructor calling");//Default Constructor
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("Salary ="+salary);
	}
	A(String n,int a,double s)//Costructor doesn't have return type
	{
		System.out.println("Parameterized Constructor calling, Parameter="+a);//Parameterized Constructor
		name=n;
		age=a;
		salary=s;
	}
	
}

//1. Constructor name must be the same as its class name
//2. Constructor must have no return type.
//3. Constructor cannot be static.
//Object Creation: Allocate Memory for nonstatic variable, Execute Default Constructor, Returns reference