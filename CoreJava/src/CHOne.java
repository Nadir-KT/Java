/*  BASIC PROGRAMS(USE SUITABLE LOOPS(EX: DO..WHILE, FOR,WHILE))
1. How to reverse a number in java.
2. Write a program to check whether the input number is palindrome or not
3. Write a java program that takes 5 numbers as input and calculate the average of the numbers
4. Write a program to check whether the number is Armstrong or not
5. Write a java program to print prime numbers within limits
6. Write a java program to swap two numbers without  creating third variable 
7. Write a program to check whether the input year is Leap  year or not 
8. How to create a  star pyramid pattern using ‘*’ in Java   * * * * * * *     * * *  * *        *  * *          * *            *       
9. Write A program To Print Full Diamond Pattern Using ‘*’ In Java       *    ***   *****  ******* *********  *******   *****    ***     *   
10. Write A Program To Print Inverted Half Pyramid Pattern Using Numbers In Java  1 2 3 4 5 1 2 3  4 1 2 3  1 2 1   
11. Write A Program To Print Hollow Rectangle Using ‘*’ In Java  
12. Create A Number Pyramid Program In Java  1  2 3  4 5 6   7 8 9 10  11 12 13 14  15 16 17 18 19 20 21 22 23 24 25   
13. Create A Number Pyramid Program In Java              5            4 4 4          3 3 3 3 3 3        2 2 2 2 2 2 2 2      1 1 1 1 1 1 1 1 1 1  
14. Create A  Pattern Program In Java Using Letters       A  B C  D   E         A   B  C  D            A   B  C               A  B                 A       15.Create A Pattern Program in java Using numbers             5 5 5 5 5         4 4 4 4 4        3 3 3 3 3        2 2 2 2 2         1 1 1 1 1   */
import java.util.Scanner;
class CHOne
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/*1. Reverse a number
		System.out.println("Enter the no. to Reverse");
		int number = scan.nextInt();
		for(int a=number;a>=1;a--)
		{
			System.out.print(a+" ");
		}
		System.out.println();*/
		//1. Reverse a number
		int d, num,temp, revnum = 0;
		System.out.println("Enter a number ::");
		num = scan.nextInt();
		temp = num;
		while (temp >0)
		{
			d = temp %10;
			revnum = (revnum*10)+d;
			temp = temp/10;
		}
		System.out.println("Reverse of the given number is:"+revnum);
		//2. Check whether the input number is palindrome or not
		if(revnum==num)
			System.out.println("It is a Palindrome number.");
		else
			System.out.println("Not a palindrome");  
		//3. Take 5 numbers as input and calculate the average of the numbers
		System.out.println();
		System.out.println("Enter 5 numbers as input");
		float n1 = scan.nextInt();
		float n2 = scan.nextInt();
		float n3 = scan.nextInt();
		float n4 = scan.nextInt();
		float n5 = scan.nextInt();
		float n = (n1+n2+n3+n4+n5)/5;
		System.out.println("Average of the numbers = "+n);
		//4. Check whether the number is Armstrong or not
		System.out.println("Enter a number check whether it's Armstrong or not");
		int in=scan.nextInt();
		int sum=0, numb=in;
		while (numb > 0)
		{
			int remainder = numb % 10;
			sum = sum + (remainder * remainder * remainder);
			numb = numb/10;
		}
		if(sum==in)
			System.out.println(in+" is a armstrong number ");
		else
			System.out.println(in+" is not a armstrong number ");
		//5. Print prime numbers within limits
		System.out.print("Enter the range of prime numbers to print: ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		for(int i=start; i<=end; i++)
		{
			int chk = 0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					chk++;
					break;
				}
			}
			if(chk==0)
			{
				System.out.println(i);
			}
		}
		//6. Swap two numbers without creating third variable
		System.out.println();
		System.out.println("Enter 2 numbers to swap");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		s1 = s2+s1;
		s2 = s1-s2;
		s1 = s1-s2;
		System.out.println(s1);
		System.out.println(s2);
		//7. Check whether the input year is Leap year or not 
		System.out.println("Enter an Year :: ");
		int year = scan.nextInt();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
		{
			System.out.println(year + " is a leap year.");
		} 
		else 
		{
			System.out.println(year + " is not a leap year.");
		}
		//8. Star pyramid pattern using ‘*’
		System.out.println("Enter the number of rows for star pyramid");
		int rows = scan.nextInt();
		for(int i=rows;i>=1;i--)
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//9. Print Full Diamond Pattern Using ‘*’
		for(int i=1;i<=rows;i++)
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//10. Print Inverted Half Pyramid Pattern Using Numbers
		for(int i=rows;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		//11. Print Hollow Rectangle Using ‘*’
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
		//12. Number Half Pyramid Program
		int p=1;
		for(int i=1;i<=rows;i++)
		{
			for(int o=1;o<=i;o++)
			{
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
		System.out.println();
		//13. Number Pyramid Program
		for(int i=rows;i>=1;i--)
		{
			for(int o=1;o<=i;o++)
			{
				System.out.print(" ");
			}
			for(int s=rows;s>=i;s--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		//14. Pattern Program Using Letters
		System.out.println("Enter the last letter for pattern");
		char c = scan.next().charAt(0);   
		for(char i=c;i>='a';i--)
		{
			for(char j=i;j<=c;j++)
			{
				System.out.print(" ");
			}
			for(char k='a';k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		//15. Pattern Program Using Numbers
		for(int i=rows;i>=1;i--)
		{
			for(int k=1;k<=rows;k++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		System.out.println();
	}
}