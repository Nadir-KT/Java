/* Modifiers: Used to control visibility
Access Modifiers: 
private(can't be accessed outside the class or package), 
default(can't be accessed outside the package), 
protected(can't be accessed outside the package, can be accessed by same package and sub classes in the same package), 
public(can be accessed in any packages and classes)
nonAccess Modifiers: static,final,abstract(Interface),synchronized(multi-threading)

Method: Set of statements which execute when it is called */

class Modifiers
{
	String name="Lab";
	int price=7500;
	public static void main(String[]args){
		Modifiers d1=new Modifiers();
		System.out.println(d1);
		new Modifiers().barking();
		//d1.barking();//Method calling
		d1.fetching();
	}
	//Method Syntax:accessModifier returnType methodName(arguments){}
	public void barking()
	{
		System.out.println("Dog Barking");
		System.out.println("Dog name="+name);
		System.out.println("Dog price="+price);
	}
	void fetching()
	{
		System.out.println("Fetching Food");
	}
	
}