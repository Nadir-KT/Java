class Prime
{
	public static void main(String[] args)
	{
		int no=13;
		int flag=0;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No is Prime");
		}
		else
		{
			System.out.println("No is not Prime");
		}
	}
}