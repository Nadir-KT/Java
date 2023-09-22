class Loops
{
	public static void main(String[] args)
	{
		//for(initialization; test condition; iteration){Statements}
		for(char i='a';i<='z';i++)
		{
			System.out.println(i);
		}
		//while(condition){Statements}
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		//do{Statement}while(condition)
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=1);
	}
}