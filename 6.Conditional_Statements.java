class Condition
{
	public static void main(String[] args)
	{
		//if(condition){statement}
		//if(condition){true block}
		//else{false block}
		int number=20;
		if(number%2==0)
		{
			System.out.println("Even no.");
		}
		else
		{
			System.out.println("Odd no.");
		}
		//if(condition 1){statement 1}
		//else if(condition 2){statement 2}
		//else if(condition N){statement N}
		//else{false block}
		if(number>=50&&number<60)
		{
			System.out.println("Passed");
		}
		else if(number>=60&&number<=70)
		{
			System.out.println("First class");
		}
		else if(number>70&&number<=80)
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Fail");
		}
		//if(condition 1){if(condition 2){statements}else{false block}}
		//else{false block}
		if(number>30)
		{
			if(number>50)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		else
		{
			System.out.println("Fail");
		}
		/*switch(expression)
		{
			case value1:
			statement1;
			break;
			case value2:
			statement2;
			break;
			default:
			defaultStatement;
			break;
		}*/
		String a="java";
		switch(a)
		{
			case "java":
			System.out.println("java");
			break;
			case "python":
			System.out.println("python");
			break;
			default:
			System.out.println("defaultStatement");
			break;
		}
	}
}