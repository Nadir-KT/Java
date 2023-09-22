class Animal
{
	public static void main(String[]args){
		Animal a1=new Animal();
		String a=a1.move("Elephant",12);
		System.out.println(a);
		char b=a1.makeSound();//Return Value
		System.out.println(b);
		a1.eatingFood("vegetables");//Arguiment Passing
	}
	//Method Syntax:accessModifier returnType methodName(arguments){}
	String move(String name,int id)
	{
		System.out.println(name+" Moving with id "+id);
		return "Elephant returned home";
	}
	char makeSound()
	{
		System.out.println("Animal Making Sound");
		return 's';
	}
	void eatingFood(String food)
	{
		System.out.println("Animal Having Food "+food);
	}
	
}