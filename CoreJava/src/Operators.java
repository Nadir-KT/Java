class Operators
{
	public static void main(String[] args)
	{
		//Arithmetic Operators: +,-,*,/,%
		int a=10;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//Relational Operators: <,>,<=,>=,==,!=,instanceof
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		//Shift Operators: <<,>>
		System.out.println(a<<b);
		System.out.println(a>>b);
		//Unary Operators: ++,--
		int c=a++;//c=10,a==11
		int d=--c;//d=9,c=9
		--d;//d=8
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(c);
		System.out.println(d);
		//Bitwise Operators: &,^,|
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a|b);
		//Logical Operators: &&,||
		System.out.println(a>b&&b>a);
		System.out.println(a>b||b>a);
		//Ternary Operators: ?:
		int min=(a<b)?a:b;//condition?true:false
		System.out.println(min);
		//Assignment Operators: +=,-=,*=,/=,%=,=
		System.out.println(a+=b);//a=a+b
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
	}
}