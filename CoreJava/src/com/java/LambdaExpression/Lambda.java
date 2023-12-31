package com.java.LambdaExpression;

//Functional Interface: An interface which has only one abstract method
@FunctionalInterface
interface A
{
	void show(int i);//Abstract method: Method without implementation
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
		//obj=new xyz();//class xyz
		/*obj=new A() // Anonymous inner type
		{
			
			@Override
			public void show(int i) {
				// TODO Auto-generated method stub
				System.out.println("Anonymous inner type "+i);
			}
		};*/
		obj=(int i)-> {System.out.println("Lambda Expression "+i);};//Lambda Expression [()->]
		obj.show(25);
	}

}

/* class xyz implements A{
	@Override
	public void show(int i) {
		System.out.println("class xyz "+i);
	}
} */