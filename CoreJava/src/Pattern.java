import java.util.Scanner;
class Pattern
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int rows = scan.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int k=1;k<=rows;k++)
		{
			for(int m=1;m<=rows;m++)
			{
				if(k==1||k==rows||m==1||m==rows)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int n=1;n<=rows;n++)
		{
			for(int s=rows;s>=n;s--)
			{
				System.out.print(" ");
			}
			for(int o=1;o<=n;o++)
			{
				System.out.print(o+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}